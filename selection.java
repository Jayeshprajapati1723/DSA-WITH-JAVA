public class selection {
    //first we assume a smallest no and we compare with next no if the no is greater than the i+1 so we can change the index of smallest and fit the j th index 
    public static void main(String[] args) {
        int arr[]= {2,0,1,6,5} ;
        int sm= 0 ;
        for(int i=0;i<arr.length-1;i++) {
            int small = i ;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[small]>arr[j]) {
                    small = j;
                }

            }
            int temp = arr[small] ;
            arr[small] = arr[i] ;
            arr[i] =temp ;
        }
     for(int i=0 ;i<arr.length;i++){
    System.out.print(arr[i] +" ") ;
}

    }
}
