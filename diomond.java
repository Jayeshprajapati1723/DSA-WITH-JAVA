public class diomond {
 public static void main(String[] args) {
    int n = 5 ; int ct = 0;
    for(int i=1 ;i <=n ;i++)
 {
    for(int s = n-1 ;s>=i ;s--) {
        System.out.print(" ") ;
    }
    for(int j=1 ;j<=i+ct ;j++) {
System.out.print("*") ;
    }
System.out.println(); 
ct++;
} 

    for(int i=n ;i>=1 ;i--)
 {

    for(int j=1 ;j <= 2*i-1 ;j++) {
System.out.print("*") ;
    }

System.out.println(); 
        for(int s =i ;s<=n ;s++) {
        System.out.print(" ") ;
    }
} 

}   
}
/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/