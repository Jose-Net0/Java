package quadrante3;

public class Retas {
    private double x1, y1, x2, y2;
    public static int cont=0;

    public Retas(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        cont++;
    }

    public double comprimento() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public String exibe() {
        return "Retas: (" + x1 + ", " + y1 + ") a (" + x2 + ", " + y2 + ")";
    }
}
