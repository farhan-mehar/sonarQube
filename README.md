# Gym Management System - Java Maven

A simple Java/Maven implementation of a Gym Management System designed for
Software Quality Engineering and SonarQube analysis.

## Features
- Member management
- Staff management
- Equipment management
- Attendance management
- Membership rates
- Announcements
- Admin login model
- In-memory repositories for easy demonstration
- JUnit tests

## Requirements
- JDK 17+
- Maven 3.9+
- SonarQube running at http://localhost:9000

## Run
```bash
mvn clean test
mvn package
```

## SonarQube
Create a project in SonarQube with key:
`gym-management-system`

Then run:
```bash
mvn clean verify sonar:sonar -Dsonar.projectKey=gym-management-system -Dsonar.host.url=http://localhost:9000 -Dsonar.token=YOUR_TOKEN
```

Replace `YOUR_TOKEN` with your SonarQube token.

The project intentionally contains enough classes, validation, tests, and
maintainability/security-related code for meaningful SonarQube analysis.
