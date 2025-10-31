package exceptions;

public class ChainedExceptionDemo {

    public void performAction() {
        try {
            simulateError();
        } catch (Exception e) {
            throw new RuntimeException("Operation failed due to underlying cause", e);
        }
    }

    private void simulateError() throws Exception {
        throw new Exception("Low-level system failure simulated.");
    }
}
