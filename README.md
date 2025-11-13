# RestAssured API Testing Framework

A simple API testing project built with **Java + Gradle**, using:
- **RestAssured** — for HTTP requests and assertions
- **JUnit 5** — for running tests
- **Owner** — for managing configuration

## Configuration

The project uses the **Owner** library to manage environment-specific properties.

Example file:  
**`src/test/resources/dev.properties`**

```properties
baseUrl=https://api.example.com
apiKey=YOUR_API_KEY_HERE
```

Create this file and replace YOUR_API_KEY_HERE with your real key.

## Build & Run
```cmd
./gradlew clean test
```
```cmd
./gradlew clean test -DapiKey=123
```

Use -DapiKey for local run!