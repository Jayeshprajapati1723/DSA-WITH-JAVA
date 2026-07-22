public class insertion {
    public static void main (String args[]) {
int usarr[] ={5,3,4,1,2,0,25} ;

 for(int j=0 ; j<usarr.length ;j++) {
for(int i=0 ; i<usarr.length-1-j ;i++) {
if(usarr[i]>usarr[i+1]) {
    int temp = usarr[i] ;
    usarr[i] = usarr[i+1] ;
    usarr[i+1] =temp ;
} else {

}
 }
}
for(int i=0 ;i<usarr.length;i++) {
    System.out.println( usarr[i]) ;
}
    }
}
