package iterations;

public class FibonacciNumbers {
    private static final int limit = 20;
    public static void main(String[] args){

        int a = 0;
        int b = 1;

        while(a <= limit){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }

        fibonacciNumRecursive(0, 1);
    }

    private static int fibonacciNumRecursive(int x, int y){
        if(x >= limit)
            return x;

        System.out.println(x);
        return fibonacciNumRecursive(y, x+y);
    }
}
