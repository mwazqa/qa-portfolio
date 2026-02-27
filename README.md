# QA Engineer Portfolio

## About This Portfolio

To jest portfolio dla QA Engineer, pokazujące umiejętności w:

* Manual Testing
* API Testing
* UI Automation (Selenium + Java/Kotlin)
* SQL / Database Testing
* CI/CD i raportowanie (Allure, GitHub Actions)

Portfolio zawiera projekty podzielone na sekcje, każda ze swoją strukturą i folderami:

### Manual Testing Project

* **TestPlan/**: dokumenty planu testów (np. Test_Plan_Ecommerce.md)
* **TestCases/**: przykładowe test cases w formie Excel lub Markdown
* **BugReports/**: zgłoszenia błędów znalezionych w testach manualnych
* **Checklists/**: listy kontrolne do szybkich sprawdzeń (smoke tests)

### API Testing (RestAssured)

* **src/test/java/api/**: testy automatyczne API w Javie/Kotlin (np. AuthApiTest.java, UsersApiTest.java)
* **pom.xml**: konfiguracja projektu Maven
* **README.md**: dokumentacja testów API

### Selenium Automation Java/Kotlin

* **src/main/java/pages/**: Page Object Model dla stron demo (np. LoginPage.java, DashboardPage.java)
* **src/test/java/ui/**: testy automatyczne UI (np. DemoQaLoginTest.java, CheckoutTest.java)
* **src/test/java/api/**: opcjonalne testy API używane w połączeniu z UI
* **drivers/**: folder na sterowniki przeglądarek (np. ChromeDriver)
* **allure-results/**: wyniki raportów Allure
* **.github/workflows/**: konfiguracja CI/CD dla GitHub Actions
* **pom.xml**: konfiguracja Maven dla projektu automatyzacji
* **README.md**: dokumentacja automatyzacji UI + API

### SQL / Database Testing

* **queries/**: przykładowe zapytania SQL, SELECT, JOIN, walidacja danych po akcjach w systemie
* **README.md**: dokumentacja i opis testów DB

Każdy folder i plik w portfolio jest przygotowany tak, aby łatwo można było dodać testy, dokumentację i raporty, prezentując pełny zestaw umiejętności QA Engineer.

---

# QA Engineer Portfolio (English Version)

## About This Portfolio

This is a QA Engineer portfolio showcasing skills in:

* Manual Testing
* API Testing
* UI Automation (Selenium + Java/Kotlin)
* SQL / Database Testing
* CI/CD and reporting (Allure, GitHub Actions)

The portfolio contains projects divided into sections, each with its own folder structure:

### Manual Testing Project

* **TestPlan/**: test plan documents (e.g., Test_Plan_Ecommerce.md)
* **TestCases/**: sample test cases in Excel or Markdown
* **BugReports/**: bug reports discovered during manual testing
* **Checklists/**: checklists for quick verification (smoke tests)

### API Testing (RestAssured)

* **src/test/java/api/**: automated API tests in Java/Kotlin (e.g., AuthApiTest.java, UsersApiTest.java)
* **pom.xml**: Maven project configuration
* **README.md**: API test documentation

### Selenium Automation Java/Kotlin

* **src/main/java/pages/**: Page Object Model for demo pages (e.g., LoginPage.java, DashboardPage.java)
* **src/test/java/ui/**: automated UI tests (e.g., DemoQaLoginTest.java, CheckoutTest.java)
* **src/test/java/api/**: optional API tests used with UI
* **drivers/**: browser drivers folder (e.g., ChromeDriver)
* **allure-results/**: Allure report results
* **.github/workflows/**: GitHub Actions CI/CD configuration
* **pom.xml**: Maven configuration for automation project
* **README.md**: UI + API automation documentation

### SQL / Database Testing

* **queries/**: sample SQL queries, SELECT, JOIN, data validation after system actions
* **README.md**: DB test documentation and description

Each folder and file in this portfolio is set up to easily add tests, documentation, and reports
