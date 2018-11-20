INSERT INTO `epamfinalproject`.`roles` (`name`) VALUES ('admin');
INSERT INTO `epamfinalproject`.`roles` (`name`) VALUES ('client');

INSERT INTO `epamfinalproject`.`services` (`name`, `description`) VALUES ('Интернет', 'Безлимитные тарифные планы «Интернет»');
INSERT INTO `epamfinalproject`.`services` (`name`, `description`) VALUES ('Цифровое ТВ (IPTV)', 'Просмотр каналов в цифровом формате IPTV ');
INSERT INTO `epamfinalproject`.`services` (`name`, `description`) VALUES ('Телефонная связь', 'Городская телефонная связь');

INSERT INTO `epamfinalproject`.`tariffs` (`name`, `description`, `price`, `services_id`) VALUES ('«Комфорт 100»', 'Безлимитный интернет до 100 Мбит/с', '140', '1');
INSERT INTO `epamfinalproject`.`tariffs` (`name`, `description`, `price`, `services_id`) VALUES ('Расширенный', 'Цифровое ТВ (IPTV)', '20', '2');
INSERT INTO `epamfinalproject`.`tariffs` (`name`, `description`, `price`, `services_id`) VALUES ('Сотовая связь', 'Городская телефонная связь', '1', '3');

INSERT INTO `epamfinalproject`.`contact_information` (`id`, `city`, `street`, `home`, `apartment`, `email`, `phone`) VALUES (1,'Kharkiv','Ludviga Svobody','51b','503','denis.golovachev.24@gmail.com','+380951914327');
INSERT INTO `epamfinalproject`.`contact_information` (`id`, `city`, `street`, `home`, `apartment`, `email`, `phone`) VALUES (2,'Kharkiv','Ludviga Svobody','52b','43','ezioauditore240899@gmail.com','+380954107012');
INSERT INTO `epamfinalproject`.`accounts` (`id`, `number`, `balance`) VALUES (1,1,0);
INSERT INTO `epamfinalproject`.`accounts` (`id`, `number`, `balance`) VALUES (2,2,0);
INSERT INTO `epamfinalproject`.`users` (`login`, `password`, `first_name`, `last_name`, `surname`, `blocked`, `roles_id`, `contact_details_id`, `accounts_id`) VALUES ('dangel327','qawsed99','Denis','Aleksandrovich','Shcherba',0,1,1,1);
INSERT INTO `epamfinalproject`.`users` (`login`, `password`, `first_name`, `last_name`, `surname`, `blocked`, `roles_id`, `contact_details_id`, `accounts_id`) VALUES ('qwerty007','12211221','Michael','Aleksandrovich','Kostrov',0,2,2,2);