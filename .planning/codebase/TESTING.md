# Testing Strategy

The project has a robust testing setup, as defined in the `pom.xml`.

## Testing Frameworks
- **JUnit 5 (Jupiter):** The primary framework for writing and running unit tests.
- **AssertJ:** Used for writing fluent and descriptive assertions in tests.

## Code Coverage
- **JaCoCo:** The project is configured to use the JaCoCo Maven plugin to measure code coverage. This helps in identifying parts of the codebase that are not covered by tests.

## Test Structure
- Test classes are located in the `src/test/java` directory, mirroring the package structure of the main source code.

## Test Execution
- Tests are executed as part of the Maven build lifecycle, ensuring that they are run automatically during the build process.
