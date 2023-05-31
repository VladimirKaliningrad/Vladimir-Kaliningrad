-- create
CREATE TABLE classGB (
  Id INTEGER PRIMARY KEY,
  name    TEXT NOT NULL,
  age     TEXT NOT NULL,
  address TEXT NOT NULL
);

-- insert
INSERT INTO classGB VALUES (0001, 'Александр', '18', 'г. Москва, ул. Уральская, 5');
INSERT INTO classGB VALUES (0002, 'Константин', '23', 'г. Калининград, ул.Клиническая, 20');
INSERT INTO classGB VALUES (0003, 'Сава', '17', 'г. Екатеринбург, ул. Главная, 11');
INSERT INTO classGB VALUES (0004, 'Виталик', '30', 'г. Москва, ул. Горная, 6');
INSERT INTO classGB VALUES (0005, 'Елена', '44', 'г. Калининград, ул. Луговая, 14');


-- fetch 
SELECT * FROM classGB;

-- Запрос на поиск по ДЗ

-- SELECT `name` 
-- FROM `id`
-- WHERE `address`='Москва' AND `age`>18
