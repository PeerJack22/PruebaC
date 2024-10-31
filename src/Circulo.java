public class Circulo {

    //atributos
    double radio;

    //constructores

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo () {}

    //Setters y getters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Metodo personalizado

    public void imprimirC(){
        System.out.println("Circulo");
        System.out.println("Radio = " + radio);
    }

    public double areaC(){
        return Math.PI * radio * radio;
    }

    public double perimetroC(){
        return 2 * Math.PI * radio;
    }
}
