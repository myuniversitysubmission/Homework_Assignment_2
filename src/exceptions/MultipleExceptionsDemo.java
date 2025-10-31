package exceptions;

public class MultipleExceptionsDemo {

    public void divideAndAccessArray(int a, int b) {
        try {
            int result = a / b; // Might throw ArithmeticException
            System.out.println("Division result: " + result);

            int[] numbers = {10, 20, 30};
            System.out.println("Accessing 4th element: " + numbers[3]); // triggers ArrayIndexOutOfBounds

        } catch (ArithmeticException e) {
            System.out.println("Handled: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled: Tried to access an invalid array index.");
        } catch (Exception e) {
            System.out.println("Handled: General exception - " + e.getMessage());
        }
    }
}
