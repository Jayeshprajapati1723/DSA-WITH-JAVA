public class pallindrom {
    public static void main(String[] args) {
        int n = 25;
        int di;
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            di = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(di);
                di--;
            }
            for(int l=2 ;l<=i;l++) {
                System.out.print(l);
            } 
            System.out.println();
        }
    }
}

//    1
//    212
//   32123
//  4321234
// 543212345