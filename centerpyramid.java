public class centerpyramid {
    public static void main(String[] args) {
        int n = 5;
        int ct = 1;

        for (int i = 1; i <= n; i++) {
            for (int d = n - 1; d >= i; d--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(ct + " ");
            }
            System.out.println();
            ct++;

        }

    }
}

/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
*/