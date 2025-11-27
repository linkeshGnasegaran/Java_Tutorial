// Exception Handling
public class A21_ExceptionHandling {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Try-catch completed.");
        }
    }
}
