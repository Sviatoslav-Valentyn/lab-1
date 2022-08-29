public class Task8 {
    public static void main(final String[] args) {
        final CustomDouble numeric1 = new CustomDouble(1, 0.5);
        final CustomDouble numeric2 = new CustomDouble(1, 0.0);
        final CustomDouble numeric3 = new CustomDouble(1, 0.99);
        final CustomDouble numeric4 = new CustomDouble(0, 0.7);
        System.out.println("First number = " + numeric1.toDouble());
        System.out.println("Second number = " + numeric2.toDouble());
        System.out.println("Third number = " + numeric3.toDouble());
        System.out.println("4 number = " + numeric4.toDouble());
        final CustomDouble add1 = numeric1.add(numeric2);
        final CustomDouble add2 = numeric2.add(numeric3);
        final CustomDouble add3 = numeric1.add(numeric3);
        final CustomDouble add4 = numeric3.add(numeric3);
        final CustomDouble add5 = numeric4.add(numeric4);
        final CustomDouble subtract1 = numeric1.subtract(numeric2);
        final CustomDouble subtract2 = numeric2.subtract(numeric3);
        final CustomDouble subtract3 = numeric1.subtract(numeric3);
        System.out.print(numeric1 + " + " + numeric2 + " = " + add1 + "\n");
        System.out.print(numeric2 + " + " + numeric3 + " = " + add2 + "\n");
        System.out.print(numeric1 + " + " + numeric3 + " = " + add3 + "\n");
        System.out.print(numeric3 + " + " + numeric3 + " = " + add4 + "\n");
        System.out.print(numeric4 + " + " + numeric4 + " = " + add5 + "\n");
        System.out.print("ціле: " + add1.getInteger() + "   " + "дробове: " + add1.getFractional() + "\n");
        System.out.print("ціле: " + add2.getInteger() + "   " + "дробове: " + add2.getFractional() + "\n");
        System.out.print("ціле: " + add3.getInteger() + "   " + "дробове: " + add3.getFractional() + "\n");
        System.out.print("ціле: " + add4.getInteger() + "   " + "дробове: " + add4.getFractional() + "\n");
        System.out.print("ціле: " + add5.getInteger() + "   " + "дробове: " + add5.getFractional() + "\n");
        System.out.print(numeric1 + " - " + numeric2 + " = " + subtract1 + "\n");
        System.out.print(numeric2 + " - " + numeric3 + " = " + subtract2 + "\n");
        System.out.print(numeric1 + " - " + numeric3 + " = " + subtract3 + "\n");
        System.out.println(numeric1 + " == " + numeric1 + " = " + numeric1.equals(numeric1));
        System.out.println(numeric1 + " == " + numeric2 + " = " + numeric1.equals(numeric2));
    }
}