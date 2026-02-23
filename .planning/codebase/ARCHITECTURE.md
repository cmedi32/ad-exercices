# Application Architecture

The application architecture appears to be a desktop application built with Java and OpenJFX.

## Architectural Ambiguity
There is an unresolved architectural ambiguity:

- The `pom.xml` file includes dependencies for **OpenJFX**, indicating a Graphical User Interface (GUI).
- However, the main entry point identified (`ch.hslu.demo.DemoApp`) is a simple **command-line application**.

This suggests one of the following:
1.  The `DemoApp` is not the true entry point for the GUI application.
2.  The project is a multi-module project with both CLI and GUI components.
3.  The project is in a transitional state where the GUI is being developed, but the default entry point is still a simple CLI app.

Further investigation into the `ch.hslu.ad` package and the test suites is needed to resolve this ambiguity.
