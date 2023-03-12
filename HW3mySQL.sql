
#               Домашнее задание_3. SQL – выборка данных, сортировка, агрегатные функции
#1.Написать скрипт, возвращающий список имен (только firstname) пользователей без повторений в алфавитном порядке. [ORDER BY]
#2.Выведите количество мужчин старше 35 лет [COUNT].
#3.Сколько заявок в друзья в каждом статусе? (таблица friend_requests) [GROUP BY]

#1.
SELECT distinct firstname
from vk.users
order by firstname asc; 

#2.
select count(*) as CountMenOld35
from vk.profiles 
where gender='m' and date_add(birthday, interval 35 year)<current_date();

#3.
select status, count(*) as CountRequest
from friend_requests
group by status;

 



