import java.util.Scanner;

public class squarepattern {
    public static void main(String[] args) {
        System.out.println("Enter a number to get square pattern eg 5");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // square pattern
        for (int i = 1; i <= n; i++) {
            // row
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
sc.close();
    }
}
/*
 * output if n = 10
 **********
 **********
 **********
 **********
 **********
 **********
 **********
 **********
 **********
 **********
 */