
public class binarysrch {
    public static void main(String[] args) {
        int target = 12500;
        int mid = 0;
        int arr[] = { 2, 4, 6, 8, 12, 14, 25,1250 };
        int i = 0;
        int ct =arr.length-1 ;
        int j = arr.length - 1;
        while (ct !=0) {
            mid = (i + j) / 2;
            if (arr[mid] == target) {
        ct = 1 ;
            } else if (arr[mid] > target) {
                j = mid - 1;
            } else if (arr[mid] < target) {
                i = mid + 1;
            }      
            ct-- ;
        }
if(target == arr[mid]) {
        System.out.println("founded target =" + arr[mid] + "on index no" + mid);
} 
            else {
                System.out.println("not founded in the array " +target) ;
            }
    }
}