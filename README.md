*Trek_Bikes Automation Framework
This is a Selenium + Cucumber based automation framework created to test the Guru99 demo website.
The framework follows the Page Object Model (POM) design pattern.

🛠 Tech Stack
1. Java (JDK 11 or higher)
2. Selenium WebDriver
3. Cucumber (BDD)
4. JUnit / TestNG
5. Maven (dependency management)
6. Brave / Edge / Chrome browser support

📂 Project Structure
Trek_Bikes
│── pom.xml                 # Maven dependencies
│── src
│   └── test
│       ├── java
│       │   ├── hooks             # Hooks for driver setup/teardown
│       │   ├── pages             # Page Object classes (PaymentPage, TelecomPage, etc.)
│       │   ├── stepDefinitions   # Step definition classes (PaymentSteps, TelecomSteps, etc.)
│       │   └── runners           # Test runners
│       └── resources
│           └── features          # Cucumber feature files

⚙️ Setup Instructions
1. Clone the repository
   git clone https://github.com/<your-username>/Trek_Bikes.git
   cd Trek_Bikes
2. Install dependencies
   mvn clean install
3. Browser Driver Setup
4. Running Tests
   to run all tests: mvn test
   to run specific tests: mvn test -Dcucumber.filter.tags="@payment"
5. Example Test Scenarios
   Payment Feature
      Navigate to payment page
      Enter card details (card number, expiry, cvv)
      Verify successful payment message
   Telecom Feature
      Create a customer
      Verify success message

6. ✅ Reports
   after execution, reports are generated in target/cucumber-reports/

👩‍💻 Author: Harshita
