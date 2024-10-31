public class Cuadrado {
    //Atributos
    double lado;

    //Métodos
    //Constructor
    public Cuadrado(double lado){
        this.lado = lado;
    }

    //Constructor vacio
    public Cuadrado(){}

    //Setters

    public void setLado(double lado) {
        this.lado = lado;
    }

    //Getters

    private double getLado() {
        return lado;
    }

    //Metodo personalizado

    public void imprimirLado(){
        System.out.println("Cuadrado");
        System.out.println("los lados del cuadrado miden: "+getLado());
    }

    public double areaC(){
        return getLado()*getLado();
    }

    public double perimetroC(){
        return getLado()*4;
    }

}
