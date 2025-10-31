# Homework_Assignment_2
🧾 Exception Handling

This Assignment demonstrates four major exception handling concepts in Java using practical code examples and JUnit test cases.
The goal is to handle runtime errors gracefully, ensuring the program continues execution without crashing and all errors are properly logged or managed.

---

Each member implemented one part of the assignment, focusing on different exception-handling strategies.

| Member          | Responsibility                                                                      | Class Implemented                                             | Concept                      |
| --------------- | ----------------------------------------------------------------------------------- | ------------------------------------------------------------- | ---------------------------- |
| **Adesh**       | Developed the logic for handling multiple exceptions and created related tests.     | `MultipleExceptionsDemo.java` / `MultipleExceptionsTest.java` | Handling Multiple Exceptions |
| **Dnyaneshwar** | Implemented re-throwing exceptions and validated exception propagation using JUnit. | `RethrowExceptionDemo.java` / `RethrowExceptionTest.java`     | Re-throwing Exceptions       |
| **Harsha**      | Worked on resource management using `try-with-resources` for safe file handling.    | `ResourceManagementDemo.java` / `ResourceManagementTest.java` | Resource Management          |
| **Anil**        | Implemented exception chaining and tested cause tracking in runtime errors.         | `ChainedExceptionDemo.java` / `ChainedExceptionTest.java`     | Chaining Exceptions          |

---
🧠 Exception Handling Concepts Explained

1️⃣ Handling Multiple Exceptions
Allows managing multiple potential errors in one try block with multiple catch clauses.
Example: handling division by zero and invalid array index separately.

try {
    int result = a / b;
    int[] numbers = {10, 20, 30};
    System.out.println(numbers[3]);
} catch (ArithmeticException e) {
    System.out.println("Handled: Division by zero is not allowed.");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Handled: Tried to access an invalid array index.");
}

---

2️⃣ Re-throwing Exceptions
Used when an exception is partially handled and then re-thrown to higher layers for additional handling.

try {
    if (data == null)
        throw new NullPointerException("Data cannot be null");
    if (data.isEmpty())
        throw new IllegalArgumentException("Data cannot be empty");
} catch (NullPointerException | IllegalArgumentException e) {
    System.out.println("Handled inside method: " + e.getMessage());
    throw e; // Re-throw for upper-level handling
}

---

3️⃣ Resource Management
Ensures that resources like files or streams are properly closed even if exceptions occur, using try-with-resources.

try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
    String line = reader.readLine();
    System.out.println("First line: " + line);
} catch (IOException e) {
    System.out.println("Handled: Could not read file (" + e.getMessage() + ")");
}

---

4️⃣ Chaining Exceptions
Links one exception to another to preserve the original cause of an error.
Useful for debugging and layered error propagation.

try {
    simulateError();
} catch (Exception e) {
    throw new RuntimeException("Operation failed due to underlying cause", e);
}

---

🧪 Unit Testing and Verification
Test Design

Each concept is tested with 5 JUnit tests (total 20 tests).
The tests verify that exceptions are caught, handled, or re-thrown properly without causing program termination.

Test Suite
All test classes are combined in one suite:

@Suite
@SelectClasses({
    MultipleExceptionsTest.class,
    RethrowExceptionTest.class,
    ResourceManagementTest.class,
    ChainedExceptionTest.class
})
public class AllTests { }

---

JUnit Result

Runs: 20/20
Errors: 0
Failures: 0
🟩 All Tests Passed

---

💻 How to Run the Project

1. Open the project in Eclipse IDE.
2. Ensure all packages are structured as:

src/
  exceptions/
  tests/

3. Create a file sample.txt in the root directory with content like:
This is a sample text file for testing ResourceManagementDemo.

4. Right-click AllTests.java → Run As → JUnit Test.
5. Observe the green bar (no errors) and console output.

---

🧾 Sample Console Output
Division result: 5
Handled: Tried to access an invalid array index.
Handled: Division by zero is not allowed.
Processing data: Hello
Handled inside method: Data cannot be null
Handled inside method: Data cannot be empty
First line: This is a sample text file for testing ResourceManagementDemo.
Handled: Could not read file (no_file.txt (The system cannot find the file specified))

---

🧩 Learning Outcomes

Learned how to implement and manage multiple exception types.
Understood propagation and re-throwing of exceptions.
Practiced safe resource handling with try-with-resources.
Applied exception chaining for layered error context.
Validated all scenarios using JUnit automated testing.

---

Explanation Video Link:https://drive.google.com/file/d/1MABjojhOZ3kfjzyACeZn6Z_OdjWHu8oh/view?usp=sharing****

---
