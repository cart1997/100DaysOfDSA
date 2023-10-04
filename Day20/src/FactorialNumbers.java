public class FactorialNumbers {

    // by using recursion writing the factorial of numbers

    public static void main(String[] args) {
        int number = 4;
        System.out.println(factorialNumb(number));
    }


    static int factorialNumb(int n){
        if (n==1) return n;
        return n * factorialNumb(n-1);
    }
}
