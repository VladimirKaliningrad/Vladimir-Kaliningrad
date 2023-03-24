/*Итоговый проект. SQL – Транзакции. Временные таблицы, управляющие конструкции, циклы

1.Написать функцию, которая удаляет всю информацию об указанном пользователе из БД vk. Пользователь задается по id. 
  Удалить нужно все сообщения, лайки, медиа записи, профиль и запись из таблицы users. Функция должна возвращать номер пользователя.
2.Предыдущую задачу решить с помощью процедуры и обернуть используемые команды в транзакцию внутри процедуры.
3.* Написать триггер, который проверяет новое появляющееся сообщество. Длина названия сообщества (поле name) должна быть не менее 5 символов. 
  Если требование не выполнено, то выбрасывать исключение с пояснением.*/

#1.Написать функцию, которая удаляет всю информацию об указанном пользователе из БД vk. Пользователь задается по id. 
  #Удалить нужно все сообщения, лайки, медиа записи, профиль и запись из таблицы users. Функция должна возвращать номер пользователя.
USE vk;

DROP FUNCTION IF EXISTS vk.delete_user;

DELIMITER $$
$$
CREATE DEFINER=`root`@`localhost` FUNCTION `vk`.`delete_user`(del_id BIGINT UNSIGNED) RETURNS BIGINT UNSIGNED
    READS SQL DATA
BEGIN
	# удаляем сообщения
	DELETE FROM messages
    WHERE (from_user_id = del_id) OR (to_user_id = del_id);
	
    # удаляем друзей :(
    DELETE FROM friend_requests
    WHERE (initiator_user_id = del_id) OR (target_user_id = del_id);
    
    # удаляем членство в группах
    DELETE FROM users_communities
    WHERE user_id = del_id;
	
    # удаляем лайки пользователя (поставленные и полученные)
    DELETE FROM likes
    WHERE (user_id = del_id) 
    OR (media_id IN (SELECT id FROM media WHERE user_id = del_id));
    
    # удаляем фотографии, принадлежащие пользователю, из чужих профилей
    UPDATE profiles
    SET photo_id = NULL
    WHERE photo_id IN (SELECT id FROM media WHERE user_id = del_id);
    
    # удаляем весь контент пользователя
    DELETE FROM media
    WHERE user_id = del_id;
    
    # удаляем профиль
    DELETE FROM profiles
    WHERE user_id = del_id;
    
    # удаляем основную запись
    DELETE FROM users
    WHERE id = del_id;
RETURN del_id;
END$$
DELIMITER ;
# Вызов функции
SELECT delete_user(1);


#2. Предыдущую задачу решить с помощью процедуры и обернуть используемые команды в транзакцию внутри процедуры.

DROP PROCEDURE IF EXISTS `delete_user`;

DELIMITER $$

CREATE PROCEDURE `delete_user`(del_id BIGINT UNSIGNED)
BEGIN
    DECLARE `_rollback` BOOL DEFAULT 0;
   	DECLARE code varchar(100);
   	DECLARE error_string varchar(100);
   	DECLARE tran_result varchar(100);

   DECLARE CONTINUE HANDLER FOR SQLEXCEPTION
   begin
    	SET `_rollback` = 1;
	GET stacked DIAGNOSTICS CONDITION 1
          code = RETURNED_SQLSTATE, error_string = MESSAGE_TEXT;
    	set tran_result := concat('Error occured. Code: ', code, '. Text: ', error_string);
    end;
		        
    START TRANSACTION;
		DELETE FROM messages
		WHERE (from_user_id = del_id) OR (to_user_id = del_id);
		
		DELETE FROM friend_requests
		WHERE (initiator_user_id = del_id) OR (target_user_id = del_id);
		
		DELETE FROM users_communities
		WHERE user_id = del_id;
		
		DELETE FROM likes
		WHERE (user_id = del_id) 
		OR (media_id IN (SELECT id FROM media WHERE user_id = del_id));
		
		UPDATE profiles
		SET photo_id = NULL
		WHERE photo_id IN (SELECT id FROM media WHERE user_id = del_id);
		
		DELETE FROM media
		WHERE user_id = del_id;
		
		DELETE FROM profiles
		WHERE user_id = del_id;
		
		DELETE FROM users
		WHERE id = del_id;	
	    IF `_rollback` THEN
		SELECT tran_result;
	       ROLLBACK;
	    ELSE
		set tran_result := concat(del_id);
        SELECT del_id;
	       COMMIT;
	    END IF;
END$$

DELIMITER ;

# Вызов процедуры
CALL delete_user(1);

#3. Написать триггер, который проверяет новое появляющееся сообщество. Длина названия сообщества (поле name) должна быть не менее 5 символов. 
    #Если требование не выполнено, то выбрасывать исключение с пояснением.

DROP TRIGGER IF EXISTS check_community_name_before_insert;

DELIMITER //

CREATE TRIGGER check_community_name_before_insert
BEFORE INSERT ON communities
FOR EACH ROW
begin
    IF LENGTH(NEW.name) < 5 THEN
        SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'Community name must be 5 characters at least';
    END IF;
END//

DELIMITER ;

# Проверка триггера
INSERT INTO communities(id, name) VALUES (500, 'hr');

