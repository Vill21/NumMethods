public class dot {
    public dot(double x, double y) {
        _x = x;
        _y = y;
    }

    public String getDot() {
        return _x + " " + _y;
    }

    private double _x = 0.0;
    private double _y = 0.0;
}