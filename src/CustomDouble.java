import java.util.Objects;

public class CustomDouble {
    private int integer;
    private double fractional;

    public double getFractional() {
        return fractional;
    }

    public void setFractional(final double fractional) {
        this.fractional = fractional;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(final int integer) {
        this.integer = integer;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final CustomDouble that = (CustomDouble) o;
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

    public CustomDouble(final double result) {
        this.integer = (int) result;
        this.fractional = result - integer;
    }
    public double toDouble() {
        return (double) integer + fractional;
    }
    public CustomDouble add (final CustomDouble numeric) {
        final double result = this.toDouble() + numeric.toDouble();
        return new CustomDouble(result);
    }


    public CustomDouble subtract(final CustomDouble numeric) {
        final double result = this.toDouble() - numeric.toDouble();
        return new CustomDouble(result);
    }

    public String toString() {
        return Double.toString(toDouble());
    }
}
