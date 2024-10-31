public class Rectangulo {
    //Atributos
    double altura;
    double base;
    //Metodos
    //Constructores

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo() {}

    //Setters y getters

    private double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //Metodo personalizado
    public void imprimirR(double altura, double base) {
        System.out.println("Rectángulo");
        System.out.println("Altura: " + altura);
        System.out.println("Base: " + base);
    }

    public double areaR(){
        return base*altura;
    }

    public double perimetroR(){
        return 2*(base+altura);
    }
}
