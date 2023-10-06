public class Recursion {

    // here Understanding the proper recursion
    // Find the n fibonacci number

    // basic rule of fibonacci is func(n) = func(n-1) + func(n-2);

    public static void main(String[] args) {
        int findingNumber = 10;

        System.out.println(fibonacciNumber(findingNumber));
    }

    static int fibonacciNumber(int n){

        if (n<2) return  n;
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);

    }
}
