import java.util.Objects;

public class CustomDouble {
    private int integer;
    private double fractional;

    public double getFractional() {
        return fractional;
    }

    public void setFractional(double fractional) {
        this.fractional = fractional;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDouble that = (CustomDouble) o;
        return integer == that.integer && Double.compare(that.fractional, fractional) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, fractional);
    }

    public CustomDouble(final int integer, final double decimal) {
        this.integer = integer;
        this.fractional = decimal;
    }

    public double toDouble() {
        return (double) integer + fractional;
    }

    public CustomDouble sumOfNumbers(final CustomDouble numeric) {
        return new CustomDouble(integer + numeric.integer, fractional + numeric.fractional);
    }


    public CustomDouble differenceOfNumbers(final CustomDouble numeric) {
        return new CustomDouble(integer - numeric.integer, fractional - numeric.fractional);
    }

    public String toString() {
        return Double.toString(toDouble());
    }
}
