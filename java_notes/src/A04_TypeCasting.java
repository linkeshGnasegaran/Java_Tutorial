// Type Casting
public class A04_TypeCasting {
    public static void main(String[] args) {
        int x = 9;
        double y = x;  // Widening
        double a = 9.78;
        int b = (int) a; // Narrowing
        System.out.println("Widening int->double: " + y);
        System.out.println("Narrowing double->int: " + b);
    }
}
