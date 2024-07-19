# Приложение для ведения спортивного дневника

## SportsDiary Application

SportsDiary - это приложение для ведения спортивного дневника, разработанное на Java с использованием Spring Boot. Приложение позволяет пользователям записывать свои тренировки, отслеживать прогресс и управлять своей спортивной активностью.

## Структура проекта

Проект организован следующим образом:
- `configuration`: Пакет для конфигурационных классов.
- `controller`: Пакет для контроллеров, обрабатывающих HTTP-запросы.
- `entity`: Пакет для сущностей, представляющих данные в базе данных.
- `repository`: Пакет для репозиториев, обеспечивающих доступ к базе данных.
- `response`: Пакет для классов ответов, используемых контроллерами.
- `service`: Пакет для сервисных классов, содержащих бизнес-логику.
- `SportsDiaryApplication.java`: Главный класс приложения, точка входа.

## Требования

- Java 11 или выше
- Maven 3.6.3 или выше
- PostgreSQL 12 или выше

## Установка и запуск

1. Клонируйте репозиторий:

   ```bash
   git clone https://github.com/yourusername/sports-diary.git

2. Перейдите в директорию проекта:
   ```bash
   cd sports-diary
3. Настройте базу данных PostgreSQL. Создайте базу данных и пользователя:
```sql
CREATE DATABASE my_project;
CREATE USER postgres WITH PASSWORD 'A123456z';
GRANT ALL PRIVILEGES ON DATABASE my_project TO postgres;
```
4. Настройте параметры подключения к базе данных в файле application.yml:
```yaml
spring:
  application:
    name: sportsDiary
  datasource:
    url: jdbc:postgresql://localhost:5433/my_project
    username: postgres
    password: 123456
debug: false
```
5. Соберите и запустите приложение с помощью Maven:
``` bash
mvn clean install
   mvn spring-boot:run
```

## Использование

После запуска приложения оно будет доступно по адресу http://localhost:8080. Используйте Postman или любой другой HTTP-клиент для взаимодействия с API приложения.
##Разработка

Для разработки и тестирования используйте следующие команды:

    Сборка проекта: mvn clean install
    Запуск тестов: mvn test
    Запуск приложения: mvn spring-boot:run

Авторы

    Si1V