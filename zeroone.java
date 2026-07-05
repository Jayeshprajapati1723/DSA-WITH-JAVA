public class zeroone {
    public static void main(String args[]) {
        int n = 5;
        int ct = 1;
        for (int i = 1; i <= n; i++) {
        if(i%2==0) {
            ct = 0 ;
        } else {
            ct = 1 ;
        }
            for (int j = 1; j <= i; j++) {
                    System.out.print(ct);
                    if (ct == 0) {
                        ct = 1;
                    } else  {
                        ct = 0;
                    }
            }
            System.out.println();
        }
    }
}
