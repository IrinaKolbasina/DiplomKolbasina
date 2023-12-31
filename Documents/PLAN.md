# Планирование выполнения дипломной работы:

## 1. Перечень автоматизируемых сценариев (будут описаны подробно после настройки окружения):
**1. Оплата тура дебетовой картой** \
**2. Оплата тура кредитной картой** \
**3. Оплата тура дебетовой неактивной картой** \
**4. Оплата тура кредитной неактивной картой**

**Возможные валидные значения для полей:**
- Обязательное поле "Номер карты": 16 цифр.
- Обязательное поле "Месяц": 2 цифры (от 01 до 12, но не ранее текущего месяца настоящего года).
- Обязательное поле "Год": 2 цифры (текущий год + 5 лет).
- Обязательное поле "Владелец": минимум 1 буква на кириллице или латинице, дефис, пробел.
- Обязательное поле "CVC/CVV": 3 цифры (от 000 до 999).

## 2. Перечень используемых инструментов:
* **IntelliJ IDEA Community Edition**. Платформа для написания и редактирования кода. Удобная IDE со множеством вспомогательных функций.
* **Git и GitHub**. Система контроля версий, для хранения кодов автотестов и настроек окружения.
* **JUnit**. Библиотека для написания и запуска авто-тестов.
* **Gradle**. Система для автоматизации сборки приложений и сбора статистики об использовании программных библиотек.
* **Selenide**. Фреймворк для автоматизированного тестирования веб-приложений.
* **Lombok**. Библиотека для оптимизации кода и автотестов.
* **Docker**. Платформа для разработки, доставки и эксплуатации приложений.
* **Appveyor**. CI/CD система для запуска автотестов при каждом коммите в репозитории.

## 3. Перечень и описание возможных рисков при автоматизации:
* Риски изменения кода приложения, что приведет к поломке автотестов.
* Риски возникновения проблем с тестовыми данными. Например, недостаточность тестовых данных.

## 4. Интервальная оценка с учётом рисков в часах:
1. Составление плана работ (10 часов)
2. Подготовка инструментов (20 часов)
3. Написание автотестов, исправление ошибок (150 часов)
4. Составление отчетов по работе (30 часов)

## 5. План сдачи работ:
1. До 10 октября 2023 - составление плана работ.
2. С 11 по 25 октября - подготовка инструментов тестирования, написание автотестов, исправление ошибок.
3. С 26 по 28 октября - подготовка отчёта по работе.