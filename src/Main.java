import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Circulo circulo1 = new Circulo();
        Triangulo triangulo1 = new Triangulo();
        Cuadrado cuadrado1 = new Cuadrado();
        Rectangulo rectangulo1 = new Rectangulo();

        //Circulo datos
        System.out.println("Ingrese los datos del circulo: ");
        System.out.println("Ingrese el radio: ");
        double radio = scanner.nextDouble();
        circulo1.setRadio(radio);

        //Triangulo datos
        System.out.println("Ingrese los datos del triangulo: ");
        System.out.println("Ingrese la altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Ingrese la base: ");
        double base = scanner.nextDouble();
        triangulo1.setAltura(altura);
        triangulo1.setBase(base);

        //Cuadrado datos
        System.out.println("Ingrese los datos del cuadrado: ");
        System.out.println("Ingrese el lado: ");
        double lado = scanner.nextDouble();
        cuadrado1.setLado(lado);

        //Rectangulo datos
        System.out.println("Ingrese los datos del rectangulo: ");
        System.out.println("Ingrese la altura: ");
        double alturar = scanner.nextDouble();
        System.out.println("Ingrese la base: ");
        double basear = scanner.nextDouble();
        rectangulo1.setAltura(alturar);
        rectangulo1.setBase(basear);

        //Areas
        System.out.println("Área del circulo: ");
        System.out.println(circulo1.areaC());
        System.out.println("Área del triangulo: ");
        System.out.println(triangulo1.areaT());
        System.out.println("Área del cuadrado: ");
        System.out.println(cuadrado1.areaC());
        System.out.println("Área del rectangulo: ");
        System.out.println(rectangulo1.areaR());

        //Perimetros
        System.out.println("Perimetro del Circulo:");
        System.out.println(circulo1.perimetroC());
        System.out.println("Perimetro del triangulo:");
        System.out.println(triangulo1.perimetroT());
        System.out.println("Perimetro del cuadrado:");
        System.out.println(cuadrado1.perimetroC());
        System.out.println("Perimetro del rectangulo:");
        System.out.println(rectangulo1.perimetroR());

        //Sumar areas
        double sumaAreas = sumarAreas(circulo1, triangulo1, cuadrado1, rectangulo1);
        System.out.println("Suma de todas las áreas: " + Math.round(sumaAreas));

    }

    //metodo para sumar areas
    public static double sumarAreas(Circulo circulo1, Triangulo triangulo1, Cuadrado cuadrado1, Rectangulo rectangulo1) {
        return circulo1.areaC()+ triangulo1.areaT()+ cuadrado1.areaC()+rectangulo1.areaR();
    }
}