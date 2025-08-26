# Trek_Bikes
Trek_Bikes Automation Framework
This is a Selenium + Cucumber based automation framework created to test the Guru99 demo website.
The framework follows the Page Object Model (POM) design pattern.

🛠 Tech Stack
Java (JDK 11 or higher)

Selenium WebDriver

Cucumber (BDD)

JUnit / TestNG

Maven (dependency management)

Brave / Edge / Chrome browser support

📂 Project Structure
bash
Copy
Edit
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
Clone the repository

bash
Copy
Edit
git clone https://github.com/<your-username>/Trek_Bikes.git
cd Trek_Bikes
Install dependencies
Make sure Maven is installed and run:

bash
Copy
Edit
mvn clean install
Browser Driver Setup

Default: ChromeDriver

Brave (example):

java
Copy
Edit
ChromeOptions options = new ChromeOptions();
options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
WebDriver driver = new ChromeDriver(options);
Edge: Replace with EdgeDriver where needed.

▶️ Running Tests
Run all tests:

bash
Copy
Edit
mvn test
Run tests by tag:

bash
Copy
Edit
mvn test -Dcucumber.filter.tags="@payment"
🧪 Example Test Scenarios
Payment Feature

Navigate to payment page

Enter card details (card number, expiry, cvv)

Verify successful payment message

Telecom Feature

Create a customer

Verify success message

✅ Reports
After execution, reports are generated in:

bash
Copy
Edit
target/cucumber-reports/
🙌 Contribution
Feel free to fork this repo and raise PRs with improvements like:

Adding new test cases

Enhancing page objects

Improving CI/CD integration

📌 Notes
Ensure you are connected to the internet (Guru99 site is external).

Use valid browser drivers in your PATH.

Tested on Java 11, Maven 3.9, Chrome 115+.

👩‍💻 Author: Harshita
