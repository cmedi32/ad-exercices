# Codebase Structure

The project follows a standard Apache Maven directory layout.

## Key Directories
- **`src/main/java`**: Contains the main application source code.
  - **`ch.hslu.ad`**: Likely contains the core logic for the "Algorithms and Data Structures" exercises.
  - **`ch.hslu.demo`**: Contains the `DemoApp` entry point.
- **`src/test/java`**: Contains the test source code.
- **`config`**: Contains configuration files for code quality tools.
  - **`checkstyle/checkstyle.xml`**: Checkstyle rules.
  - **`pmd/pmd_hslu.xml`**: PMD rules.
- **`src/main/resources`**: Contains resource files, such as `logback.xml` and `version.properties`.
- **`exercices`**: Contains PDF files with exercise descriptions.
- **`.idea`, `.mvn`**: IDE and Maven wrapper specific files.

## Important Files
- **`pom.xml`**: The Maven Project Object Model file, defining the project's dependencies, build process, and plugins.
- **`Dockerfile`**: Suggests that the application can be containerized.
- **`.gitlab-ci.yml`**: Indicates that the project is integrated with GitLab CI/CD.
