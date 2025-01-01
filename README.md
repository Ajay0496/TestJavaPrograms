# REST Assured BDD API Testing Framework

## Overview
This project implements a BDD-style API testing framework using REST Assured, TestNG, and Allure reporting. It demonstrates various approaches to API testing, including data-driven testing using different file formats (CSV, Excel, JSON) and different ways of handling request payloads.

## Features Tested

### API Operations
1. **GET Requests**
   - Basic GET operations
   - Authentication handling
   - Cookie-based requests
   - Parameter validation

2. **POST Requests**
   - Using POJO classes
   - Using JSON files
   - Using JSON Objects
   - Dynamic payload generation
   - UUID-based requests

3. **PUT/PATCH Requests**
   - Update operations
   - Partial updates

4. **File Operations**
   - File upload functionality
   - File handling

5. **End-to-End Flows**
   - Complete API workflows
   - Chained API requests

### Data-Driven Testing
- CSV file-based testing
- Excel file-based testing
- JSON file-based testing
- Dynamic data generation

## Tech Stack
- Java 8+
- REST Assured
- TestNG
- Allure Report
- Maven
- Apache POI
- Jackson API
- Log4j2
- BDD Framework

## Project Structure


RestAssuredAPITestingBDD/
├── src/
│   ├── main/java/
│   └── test/
│       ├── java/
│       │   └── com.testautomation.apitesting/
│       │       ├── pojos/
│       │       │   ├── Booking.java
│       │       │   └── BookingDates.java
│       │       ├── tests/
│       │       │   ├── AllureReportGeneration.java
│       │       │   ├── BasicAuth.java
│       │       │   ├── Cookies.java
│       │       │   ├── CreateAPIRequestDynamically.java
│       │       │   ├── DataDrivenTestingUsingCSVFile.java
│       │       │   ├── DataDrivenTestingUsingExcelFile.java
│       │       │   ├── DataDrivenTestingUsingJsonFile.java
│       │       │   ├── EndToEndAPITest.java
│       │       │   ├── FileUpload.java
│       │       │   ├── GetAPIRequest.java
│       │       │   ├── PatchAPIRequest.java
│       │       │   ├── PostAPIRequestUsingFile.java
│       │       │   ├── PostAPIRequestUsingJSONObject.java
│       │       │   ├── PostAPIRequestUsingPojos.java
│       │       │   ├── PostAPIRequestUsingUID.java
│       │       │   └── PutAPIRequest.java
│       │       └── utils/
│       │           ├── BaseTest.java
│       │           ├── ExtentReportManager.java
│       │           ├── FileNameConstants.java
│       │           └── RestAPIHelper.java
│       └── resources/
│           ├── ~$TestRunner.xlsx
│           ├── exceltestdata.xlsx
│           ├── expectedjsonschema.txt
│           ├── log4j2.properties
│           ├── patchapirequestbody.txt
│           ├── postapirequestbody.txt
│           ├── postapirequestbodydynamic.txt
│           ├── putapirequestbody.txt
│           ├── testdatacsv.csv
│           ├── testdatajson.json
│           ├── TestRunner.xlsx
│           └── tokenapirequestbody.txt
└── suites/
    ├── AllureReportapitest.xml
    ├── Datadriventestingusingcsv.xml
    ├── Datadriventestingusingexcel.xml
    ├── Datadriventestingusingjson.xml
    ├── ExtentReportCreateAPIRequestDynamicallyE2Etest.xml
    ├── PostAPIRequestUsingJSONFile.xml
    ├── PostAPIRequestUsingJSONObject.xml
    ├── PostAPIRequestUsingPojo.xml
    ├── PostAPIRequestUsingUUID.xml
    ├── Restassuredapitest.xml
    └── Restassuredapitest2.xml

### Key Components Explanation
1. POJO Classes (pojos/)
Booking.java: Data model for booking information
BookingDates.java: Data model for booking dates

2. Test Classes (tests/)
Various test classes implementing different testing approaches
Includes authentication, data-driven, and end-to-end tests

3. Utility Classes (utils/)
BaseTest.java: Common test setup and teardown
ExtentReportManager.java: Reporting configuration
RestAPIHelper.java: Helper methods for API operations

4. Resources
Test data files in various formats (CSV, Excel, JSON)
Request body templates
Configuration files

### How to Run the Project
Prerequisites
Java 8 or higher
Maven
IDE (Eclipse/IntelliJ)
TestNG Plugin

### Running Tests
Clone the Repository
git clone <repository-url>
cd RestAssuredAPITestingBDD

### Install Dependencies
mvn clean install

### Run All Tests
mvn test

### Run Specific Test Suites
mvn test -DsuiteXmlFile=suites/Restassuredapitest.xml
mvn test -DsuiteXmlFile=suites/PostAPIRequestUsingPojo.xml

### Running Data-Driven Tests
mvn test -DsuiteXmlFile=suites/Datadriventestingusingcsv.xml
mvn test -DsuiteXmlFile=suites/Datadriventestingusingexcel.xml
mvn test -DsuiteXmlFile=suites/Datadriventestingusingjson.xml

### Reporting
Allure Reports
Extent Reports
TestNG Reports

### Best Practices Implemented
BDD approach for test writing
Data-driven testing
Modular framework design
Multiple payload handling approaches
Comprehensive logging
Detailed reporting
Reusable components

### Contributing
Please read CONTRIBUTING.md for details on our code of conduct, and the process for submitting pull requests.

### License
This project is licensed under the MIT License - see the LICENSE.md file for details
