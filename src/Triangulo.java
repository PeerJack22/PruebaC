public class Triangulo {
    double base;
    double altura;

    //Constructores

    public Triangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){}

    //Setters y getters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodo personalizado

    public void imprimirT(){
        System.out.println("Triángulo");
        System.out.println("Base: "+getBase());
        System.out.println("Altura: "+getAltura());
    }

    public double areaT(){
        return base*altura;
    }

    public double perimetroT(){
        return 2*base*altura;
    }
}
