здравствуйте.

коротко про main: -- загрузка данных из csv, -- создание db данными из списка, -- построение графа, -- вычисление срзнач гранта, -- вычисление кол-ва грантов.

про grantdata: -- класс grantdata послужил хранилищем информации о грантах -- в конструкторе указали все перечисленные выше в коде атрибуты, сам конструктор присваивает значения атрибутам объе5кта

про chart: -- создание наобора данных для графа -- создание графа (добавление данных, панелль для графа) -- установка панели для отображения графика

про sql:

создаем, подключаемся к бд, создаем таблицы и наполняем их. далее идет наполнение таблиц MAINCompanyName, BusinessTypeAndYear, GrantSize, StreetName.

создаем метод для подключения connectionBD

создаем запросы в строке, выполняем, заносим полученные значения в график ддля каждой задачи.

скрин:

![bWtz2bpuwkE](https://github.com/VladKirichenko0/finality/assets/156305350/feb068ca-cd33-4001-8e4d-e8568fcc9130)
![eajbG83rmsc](https://github.com/VladKirichenko0/finality/assets/156305350/7ec45076-fb03-452b-8cf2-db1f4c21a9cd)
![LCDnbGXsdF0](https://github.com/VladKirichenko0/finality/assets/156305350/171d6a80-516c-4a61-b8c0-8c524c5b021f)

