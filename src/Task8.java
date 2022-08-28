public class Task8 {
    public static void main(final String[] args) {
        final CustomDouble  numeric1 = new CustomDouble(2, -1.5);
        final CustomDouble  numeric2 = new CustomDouble(1, 1.5);
        System.out.println("First number = " + numeric1.toDouble());
        System.out.println("Second number = " + numeric2.toDouble());
        final CustomDouble sumOfNumbers = numeric1.sumOfNumbers(numeric2);
        final CustomDouble differenceOfNumbers = numeric1.differenceOfNumbers(numeric2);
        System.out.print(numeric1 + " + " + numeric2 + " = " + sumOfNumbers + "\n");
        System.out.print(numeric1 + " - " + numeric2 + " = " + differenceOfNumbers + "\n");
        System.out.println(numeric1 + " == " + numeric1 + " = " + numeric1.equals(numeric1));
        System.out.println(numeric1 + " == " + numeric2 + " = " + numeric1.equals(numeric2));
    }
}