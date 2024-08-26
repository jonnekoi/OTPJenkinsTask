public class Main {
    private double x;
    private double y;

    public Main(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Main other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}