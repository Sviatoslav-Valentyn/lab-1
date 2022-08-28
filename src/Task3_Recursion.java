public class Task3_Recursion {
    public static int factorial(final int n) {
        int result = 1;
        if (n == 1 || n == 0)
        {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }
    public static void main(final String[] args){
        System.out.println(factorial(5));
    }
}
