public class Calculator {
    public CustomDouble add(final CustomDouble n1, final CustomDouble n2){
        return n1.add(n2);
    }

    public CustomDouble subtract(final CustomDouble n1, final CustomDouble n2){
        return n1.subtract(n2);
    }

    public static int multiply(final int n1, final int n2) {
        return n1*n2;
    }
    public double multiply(final CustomDouble n1, final CustomDouble n2){
        return n1.toDouble() * n2.toDouble();
    }

    public double divide(final CustomDouble n1, final CustomDouble n2){
        return n1.toDouble() / n2.toDouble();
    }
    public static int divide(final int n1, final int n2) {
        return n1/n2;
    }
}
