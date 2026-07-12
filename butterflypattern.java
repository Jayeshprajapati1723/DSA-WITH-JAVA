public class butterflypattern {
    public static void main(String args[]) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
