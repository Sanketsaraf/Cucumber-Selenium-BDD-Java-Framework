# Selenium BDD Framework

A Java-based Selenium BDD framework using Cucumber and Allure for reporting. This project is set up using Maven and follows the Page Object Model (POM) design pattern.

## Tech Stack

- **Java**: Programming language used for writing test scripts.
- **Selenium**: Browser automation tool.
- **Cucumber**: BDD framework for writing test scenarios in Gherkin.
- **Allure**: Reporting tool for generating test reports.
- **Maven**: Build automation tool.## Setup and Installation

### Prerequisites

- Java JDK 8 or higher
- Maven 3.6.0 or higher
- Allure Commandline (Install from [Allure](https://docs.qameta.io/allure/#_get_started))

### Installation Steps

1. **Clone the repository**:

    ```sh
    git clone https://github.com/yourusername/selenium-bdd-framework.git
    cd selenium-bdd-framework
    ```

2. **Install dependencies**:

    ```sh
    mvn clean install
    ```

## Running Tests

1. **Run tests using Maven**:

    ```sh
    mvn test
    ```

2. **Generate Allure report**:

    ```sh
    mvn allure:report
    ```

3. **Serve Allure report** (optional, opens the report in a web browser):

    ```sh
    mvn allure:serve
    ```

## Adding More Test Cases

1. **Create a new feature file** in `src/test/resources/features`. For example, `newfeature.feature`.

    ```gherkin
    Feature: New feature

      Scenario: New scenario
        Given I am on the login page
        When I enter valid credentials
        Then I should be logged in
    ```

2. **Add step definitions** in a new or existing step definitions file in `src/test/java/stepDefinitions`.

    ```java
    package stepDefinitions;

    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.When;
    import io.cucumber.java.en.Then;

    public class NewFeatureSteps {
        
        @Given("I am on the login page")
        public void i_am_on_the_login_page() {
            // Code to navigate to login page
        }

        @When("I enter valid credentials")
        public void i_enter_valid_credentials() {
            // Code to enter credentials
        }

        @Then("I should be logged in")
        public void i_should_be_logged_in() {
            // Code to verify login
        }
    }
    ```

3. **Update the runner class** if needed to include the new feature file.

    ```java
    package runners;

    import org.junit.runner.RunWith;
    import io.cucumber.junit.Cucumber;
    import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
    )
    public class TestRunner {
    }
    ```