public class Lucas {
  public static int lucasnum (int n){
    if (n==0) return 2;
    
    if (n==1) return 1;
    
    if(n>0) return lucasnum(n-1) + lucasnum(n-2);
    
    return lucasnum(n+2) - lucasnum(n+1);
  }
  
}
/*
Lucas numbers are numbers in a sequence defined like this:

L(0) = 2
L(1) = 1
L(n) = L(n-1) + L(n-2)
Your mission is to complete the function that returns the nth term of this sequence.

Note: It should work for negative numbers as well; how you do this is you flip the equation around, so for negative numbers: L(n) = L(n+2) - L(n+1)

Examples
L(-10) = 123
L(-5)  = -11
L(-1)  =  -1
L(0)   =   2
L(1)   =   1
L(5)   =  11
L(10)  = 123
*/