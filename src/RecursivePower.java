import java.util.Scanner;

public class RecursivePower {

    static int power(int base, int power){
        if(power == 0)
            return 1;

        int result = 1;
        result *= power(base, power-1) * base;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, power;
        System.out.print("Please enter the base: ");
        base = input.nextInt();
        System.out.print("Please enter the power ");
        power = input.nextInt();

        System.out.println(power(base,power));

    }
}
