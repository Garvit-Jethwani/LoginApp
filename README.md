# Login Application

The Login Application is a sample project designed to illustrate the process of using AI-powered tools for test generation, API specification creation, source code generation, and unit test generation. This project was developed using various tools, including RoostGPT, an AI Test Generator, OpenAPI Generator, and GitHub CoPilot.

## Development Process

The development process for this project followed the following steps:

1. **Functional Test Generation**: RoostGPT was used to generate functional tests for the login functionality, resulting in a feature file (Gherkin scenarios) and an API specification file.

  This was the user description in jira ticket.
  
```

  Given the application login page is accessed.  
  When a user login to app login portal.  
  And enters the username and pwd.  
  Then the Login page is successfully displayed.  

```


  The API spec and feature file is being stored in functional_test folder in root level generated by RoostGPT.


2. **Source Code Generation**: The API specification file was used with the OpenAPI Generator to generate the initial source code for the application. The command used was:

  ```openapi-generator generate -i functional_tests/ZBIO-5233.yaml -g spring -o . --additional-properties=javaVersion=1.8```

3. **Code Enhancement**: GitHub CoPilot was utilized to resolve issues and add logic to the generated source code, enhancing its functionality.

4. **Unit Test Generation**: RoostGPT was employed to generate unit tests for the source code generated by the OpenAPI Generator, ensuring comprehensive test coverage.

This development lifecycle showcases the power of AI-powered tools in streamlining various stages of the software development process, from test generation to code generation and enhancement.

## Getting Started

To get started with the Login Application, follow these steps:

1. Clone the repository:

```git clone https://github.com/roost-io/LoginApp.git```

2. Build the project using maven:

```mvn compile```  or  ```mvn install```

3. Run the application:

```mvn spring-boot:run```

4. Explore the code, tests, and documentation to understand the implementation details and the AI-powered tools used in the development process.

# Acknowledgments

We would like to acknowledge the following tools and resources used in the development of this project:

- [RoostGPT](https://www.roost.ai/) - An AI Test Generator used for functional test and unit test generation.
- [OpenAPI Generator](https://openapi-generator.tech/) - A tool used for generating source code from API specifications.
- [GitHub CoPilot](https://pilot.github.com/) - An AI-powered coding assistant used for code enhancement and issue resolution.,


