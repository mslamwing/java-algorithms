package corejava.recursion;

public class PowerRecursion {

    /* package-private */
    static double calculatePower(double b, double x) {

        if (x == 1) {
            return b;
        }

        return b * calculatePower(b, x - 1);
    }

    static double calculatePower2(double b, double x){
        if (x == 2){
            return b * b;
        }
        return calculatePower2(b, x/2) * calculatePower2(b, x/2);
    }

    public static double power(double b, int x) {
        if (x == 0) {
            return 1; // Base case for x=0
        } else if (x == 1) {
            return b; // Base case for x=1
        } else if (x % 2 == 0) {
            double halfPower = power(b, x / 2);
            return halfPower * halfPower; // Even x
        } else {
            return b * power(b, x - 1); // Odd x
        }
    }


    public static void main(String[] args) {
        double b = 2;
        int x = 5;
        System.out.println(power(b , x));
    }

}
