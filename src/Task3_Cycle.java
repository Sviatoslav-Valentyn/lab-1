public class Task3_Cycle {
    public static int factorial(final int n)
    {
        int result = 1;
        for (int i = 1; i <= n; ++i){
            result *= i;
        }
        return result;
    }
    public static void main(final String[] args){
        System.out.println(factorial(4));
    }
}
