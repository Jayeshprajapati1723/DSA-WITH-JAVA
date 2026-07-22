public class insertion {
    public static void main (String args[]) {
int usarr[] ={5,3,4,1,2} ;int n= usarr.length;
int sortarr[]={} ;
sortarr[0] = usarr[0] ;
 
for(int i=1 ; i<usarr.length ;i++) {
if(sortarr[i-1]>usarr[i])
{
    sortarr[i] = sortarr[i-1] ;
    sortarr[i-1] = usarr[i] ;
    usarr[i] = usarr[i+1] ;
} else {
    sortarr[i+1] =usarr[i] ;
    usarr[i] = usarr[i+1] ;
}
}
for(int i=0 ;i<sortarr.length;i++) {
    System.out.println( sortarr[i]) ;
}
    }
}
