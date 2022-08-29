public class Task9 {
    public static void OperationInt(final int n1, final int n2){
        System.out.println(n1 + " * " + n2 + " = " + Calculator.multiply(n1, n2));
        System.out.println(n1 + " / " + n2 + " = " + Calculator.divide(n1, n2));
        System.out.print("\n");
    }
    public static void OperationDouble(final CustomDouble numeric1, final CustomDouble numeric2, final CustomDouble numeric3){
        System.out.println("First number = " + numeric1.toDouble());
        System.out.println("Second number = " + numeric2.toDouble());
        System.out.println("Third number = " + numeric3.toDouble());
        final Calculator Calculator = new Calculator();

        final CustomDouble sum1 = Calculator.add(numeric1, numeric2);
        final CustomDouble sum2 = Calculator.add(numeric2, numeric3);
        final CustomDouble sum3 = Calculator.add(numeric1, numeric3);
        System.out.print(numeric1 + " + " + numeric2 + " = " + sum1 + "\n");
        System.out.println(sum1.getInteger() + "  " + sum1.getFractional());
        System.out.print(numeric2 + " + " + numeric3 + " = " + sum2 + "\n");
        System.out.println(sum2.getInteger() + "  " + sum2.getFractional());
        System.out.print(numeric1 + " + " + numeric3 + " = " + sum3 + "\n");
        System.out.println(sum3.getInteger() + "  " + sum3.getFractional());

        final CustomDouble subtract1 = Calculator.subtract(numeric1, numeric2);
        final CustomDouble subtract2 = Calculator.subtract(numeric2, numeric3);
        final CustomDouble subtract3 = Calculator.subtract(numeric1, numeric3);
        System.out.print(numeric1 + " - " + numeric2 + " = " + subtract1 + "\n");
        System.out.println(subtract1.getInteger() + "  " + subtract1.getFractional());
        System.out.print(numeric2 + " - " + numeric3 + " = " + subtract2 + "\n");
        System.out.println(subtract2.getInteger() + "  " + subtract2.getFractional());
        System.out.print(numeric1 + " - " + numeric3 + " = " + subtract3 + "\n");
        System.out.println(subtract3.getInteger() + "  " + subtract3.getFractional());

        System.out.print(numeric1 + " * " + numeric2 + " = ");
        System.out.println(Calculator.multiply(numeric1, numeric2));
        System.out.print(numeric2 + " * " + numeric3 + " = ");
        System.out.println(Calculator.multiply(numeric2, numeric3));
        System.out.print(numeric1 + " * " + numeric3 + " = ");
        System.out.println(Calculator.multiply(numeric1, numeric3));

        System.out.print(numeric1 + " / " + numeric2 + " = ");
        System.out.println(Calculator.divide(numeric1, numeric2));
        System.out.print(numeric2 + " / " + numeric3 + " = ");
        System.out.println(Calculator.divide(numeric2, numeric3));
        System.out.print(numeric1 + " / " + numeric3 + " = ");
        System.out.println(Calculator.divide(numeric1, numeric3));
    }
    public static void main(final String[] args) {

        final int n1 = 250;
        final int n2 = 25;
        final CustomDouble numeric1 = new CustomDouble(1, 2.5);
        final CustomDouble numeric2 = new CustomDouble(2, 3.1);
        final CustomDouble numeric3 = new CustomDouble(2, 3.1);


        OperationInt(n1, n2);
        OperationDouble(numeric1, numeric2, numeric3);
    }
}
