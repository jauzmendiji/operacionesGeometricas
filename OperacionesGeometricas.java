import java.util.Scanner;
import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;

public class OperacionesGeometricas {

	public static void main (String args[]) {

	double radio, base, altura, resultadoPeri, resultadoArea;

	char letra;

	Scanner preg = new Scanner(System.in);
	System.out.print("\n¿Que figura quieres calcular Circulo o Rectangulo? O Terminar (C/R/T): ");
	letra = preg.next().charAt(0);

	while ((letra != 'T') && (letra != 't')){

	if ((letra == 'R') || (letra == 'r')){

		Rectangulo rectangulo = new Rectangulo();

		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa la base: ");
		base = sc.nextDouble();
		System.out.print("\ningresa la altura: ");
		altura = sc.nextDouble();
		
		rectangulo.setBase(base);
		rectangulo.setAltura(altura);

		resultadoArea = rectangulo.area();
		resultadoPeri = rectangulo.peri();

		System.out.println("\nEl area es: " + resultadoArea);
		System.out.println("\nEl perimetro es: " + resultadoPeri);
				}

	else if ((letra == 'C') || (letra == 'c')){

		Circulo circulo = new Circulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa el radio: ");
		radio = sc.nextDouble();

		circulo.setRadio(radio);

		resultadoArea = circulo.area();
		resultadoPeri = circulo.peri();

		System.out.println("\nEl area es: " + resultadoArea);
		System.out.println("\nEl perimetro es: " + resultadoPeri);
				}
	
		else{

		System.out.println("\nOperacion no valida, letra desconocida");
	
				}
		System.out.println("\nElige una de estas opciones: Circulo, Rectangulo o Terminar (C/R/T)");
		letra = preg.next().charAt(0);
		}
	}
}
