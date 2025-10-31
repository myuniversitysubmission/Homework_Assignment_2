package exceptions;

public class RethrowExceptionDemo {

    public void processData(String data) throws Exception {
        try {
            if (data == null) {
                throw new NullPointerException("Data cannot be null");
            }
            if (data.isEmpty()) {
                throw new IllegalArgumentException("Data cannot be empty");
            }
            System.out.println("Processing data: " + data);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Handled inside method: " + e.getMessage());
            throw e; // rethrow for upper layer
        }
    }
}
