# Android автотесты Wikipedia (Appium)

## Описание
В проекте реализованы автоматизированные UI-тесты для Android-приложения **Wikipedia** с использованием **Appium**, **TestNG** и **Maven**.

Тесты запускаются на Android-эмуляторе и проверяют основные пользовательские сценарии:
- поиск статьи;
- открытие статьи;
- проверку заголовка;
- проверку отображения контента статьи.

Проект выполнен в рамках задания «Часть 2. Автотесты Android-приложения Wikipedia».

---

## Используемые технологии
- Java
- Maven
- Appium Java Client
- TestNG
- Android Emulator
- UIAutomator2

---

## Реализованные сценарии

### 1. Поиск статьи и проверка заголовка
**Шаги:**
1. Открыть приложение Wikipedia.
2. Нажать на строку поиска.
3. Ввести запрос `Selenium`.
4. Открыть статью.
5. Проверить, что заголовок статьи равен `Selenium`.

**Ожидаемый результат:**  
Открывается статья с корректным заголовком.

---

### 2. Проверка отображения контента статьи
**Шаги:**
1. Выполнить поиск статьи `Selenium`.
2. Открыть статью.
3. Проверить, что первый абзац статьи отображается.

**Ожидаемый результат:**  
Контент статьи присутствует и отображается на экране.

---

## Структура проекта

```
exam2
├── src
│ └── test
│ ├── java
│ │ ├── pages
│ │ │ ├── MainScreen.java
│ │ │ └── ArticleScreen.java
│ │ └── tests
│ │ ├── MobileBaseTest.java
│ │ └── TestWikipediaMobile.java
│ └── resources
│ └── testng.xml
├── pom.xml
└── README.md
```


## Требования для запуска

### 1. Установленное ПО
- Java JDK 8+
- Maven
- Android Studio
- Android Emulator
- Node.js
- Appium Server


### 2. Установленный Appium и драйвер
```bash
npm install -g appium
appium driver install uiautomator2
```

Проверка:
```
appium
```

### 3. Android эмулятор

Создать и запустить эмулятор в Android Studio

Убедиться, что устройство видно:
```
adb devices
```

### 4. APK приложения

Используется Wikipedia Alpha APK.
Путь к APK указывается в MobileBaseTest:

```
caps.setCapability(
    MobileCapabilityType.APP,
    "C:\\Users\\Alexander\\dev\\study\\testing-exam\\exam2\\app-alpha-universal-release.apk"
);
```

## Запуск тестов
### 1. Запустить Appium сервер
```
appium
```

### 2. Запустить эмулятор Android
### 3. Запустить тесты
```
mvn clean test
```
