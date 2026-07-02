public class hollowsquare {
    public static void main(String[] args) {
        // hollow rectangle
        int n = 15;
        for (int j = 1; j <= n; j++) {
            System.out.print("*");
        }
        for (int s = 1; s <= n - 1; s++) {
            System.out.println();
            System.out.print("*");
            for (int t = 2; t <= n - 1; t++) {
                System.out.print(" ");
            }
            System.out.print("*");

        }

        System.out.println();
        for (int j = 1; j <= n; j++) {
            System.out.print("*");
        }

    }
}

/*

*****
*   *
*   *
*   *
*****


*/

