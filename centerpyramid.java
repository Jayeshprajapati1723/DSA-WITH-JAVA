public class centerpyramid {
    public static void main(String[] args) {
        int n = 5;
        int ct = 1;
        for (int i = 1; i <= n; i++) {
            for (int f = n - 1; f >= i; f--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ct);
            }
            for (int f = n - 1; f >= i; f--) {
                System.out.print(" ");
            }
            
            System.out.println();
            ct++;
        }

    }
}
