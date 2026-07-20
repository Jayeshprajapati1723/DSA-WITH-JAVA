
public class binarysrch {
    public static void main(String[] args) {
        int target = 12;
        int mid = 0;
        int arr[] = { 2, 4, 6, 8, 12, 14 };
        int i = 1;
        int j = arr.length; int ct = arr.length ;
        while (ct !=0) {
            mid = i + j / 2;
            if (arr[mid] == target) {
                System.out.println("founded target =" + arr[mid] + "on index no" + mid);
            } else if (arr[mid] > target) {
                mid = mid - 1;
            } else {
                mid = mid + 1;
                
            }
       ct -- ;
        }


    }
}