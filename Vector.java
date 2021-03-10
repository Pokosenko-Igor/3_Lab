public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x1, double y1, double z1){
        x = x1;
        y = y1;
        z = z1;
    }

    @Override
    public String toString() {
        return "Vector coordinates " + "x = "
                + x + " y = " + y +
                " z = " + z;
    }

    public double formula() {
        double square = Math.sqrt(x * x + y * y + z * z);
        return square;
    }
}
