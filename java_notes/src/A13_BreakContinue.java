// Break & Continue
public class A13_BreakContinue {
    public static void main(String[] args) {
        for (int k = 1; k <= 5; k++) {
            if (k == 3) continue; // skip 3
            if (k == 5) break;    // stop loop
            System.out.println("k = " + k);
        }
    }
}
