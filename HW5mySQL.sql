
#              Урок 5. SQL – оконные функции
#1.Создайте представление с произвольным SELECT-запросом из прошлых уроков [CREATE VIEW]
#2.Выведите данные, используя написанное представление [SELECT]
#3.Удалите представление [DROP VIEW]
#4.* Сколько новостей (записей в таблице media) у каждого пользователя? Вывести поля: news_count (количество новостей), 
#user_id (номер пользователя), user_email (email пользователя).Попробовать решить с помощью CTE или с помощью обычного JOIN.

#1.
use vk;
create or replace view friends_amount as
select
	count(*) as cnt,
    u.id
from users as u
join friend_requests as fr on (
		u.id = fr.target_user_id or u.id = fr.initiator_user_id
)
where fr.status = 'approved'
group by u.id
order by cnt desc;   

#2.
select * from friends_amount;     

#3.
drop view friends_amount;

#4.
select
	count(*),
    user_id,
    email
 from media as m
 join users as u on u.id = m.user_id
 group by user_id;
    