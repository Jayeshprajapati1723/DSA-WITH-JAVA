public class bubblesort {
    public static void main(String[] args) {
        int arr[]={1,3,7,8,2} ;
        System.out.print(arr.length) ;
for(int i=0;i<arr.length-1 ;i++) {
    if(arr[i]>arr[i+1] ) {
        int temp = arr[i] ;
        arr[i] = arr[i+1] ;
        arr[i+1] =temp ;
    }
}
for(int i=0 ;i<arr.length;i++){
    System.out.println(arr[i]) ;
}

    }
}
