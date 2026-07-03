public class invertedpyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i >= 1; i--) {
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            } //star loop
            System.out.println();
        }
    }
}
