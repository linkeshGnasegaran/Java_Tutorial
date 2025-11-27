// Methods
public class A15_Methods {

    public static void main(String[] args) {
        sayHello("Vibranium");
        int sum = addNumbers(10, 20);
        System.out.println("Sum: " + sum);
    }

    static void sayHello(String user) {
        System.out.println("Hello, " + user + "!");
    }

    static int addNumbers(int a, int b) {
        return a + b;
    }
}
