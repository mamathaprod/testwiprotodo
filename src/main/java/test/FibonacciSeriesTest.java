package test;

public class FibonacciSeriesTest {

    public static int fib(int n){
        if(n==1 || n==2)
            return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){
        //Fib(n) = Fib(n-2)+Fib(n-2)
        int n = 10;
        for(int i=1;i<=n;i++){
            System.out.println(fib(i)+ "");
        }
    }
}
