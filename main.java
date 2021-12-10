public class main {
    double a;
    double b;

    public main(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public main(double a) {
        this.a = a;
    }

    public double suma() {
        return a + b;
    }

    public double roznica() {
        return a - b;
    }

    public double iloczyn() {
        return a * b;
    }

    public double iloraz() {
        return a / b;
    }

    public double potega() {
        return Math.pow(a, b);
    }

    public double pierwiastek() {
        return Math.sqrt(a);
    }
}
