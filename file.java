import java.util.Scanner;

public class file {

    public static void setup(double... digits) {
        _dots = new dot[DOT_NUMBER];
        int i = 0, j = 0;

        while(j < digits.length) {
            _dots[i] = new dot(digits[j], digits[j + 1]);
            j += 2;
            i += 1;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] dots = new double[6];
        System.out.print("Введите " + DOT_NUMBER + " точки через пробел.\n");

        for (int i = 0; i < 6; i += 1) {
            dots[i] = in.nextDouble();
        }

        setup(dots);
        System.out.print(getDots());
    }

    public static String getDots() {
        String output = "";
        for (int i = 0; i < DOT_NUMBER; i += 1) {
            output += _dots[i].getDot() + "\n";
        }
        return output;
    }


    private static dot[] _dots;
    private static final int DOT_NUMBER = 3;
}