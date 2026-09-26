/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	/*	int a = 3;
		int b = 10;
		int div = b/a;
		System.out.println(div);
		int mod=b/a;
		System.out.println("Residuo"+mod);
		String nombre="Roni";
		int edad=16;
		double estatura = 1.88;
		boolean hombre=true;
		System.out.println("NOMBRE:"+ nombre);
		System.out.println("Edad de "+ nombre +": " + edad);
		System.out.println("Estatura de "+nombre+": "+ estatura + " metros");
		System.out.println("Hombre="+hombre);*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa tu nombre");
		String nombre1= scanner.nextLine();
		System.out.println("Hola" + nombre1);
		System.out.println("Ingresa tu edad");
		int edad= scanner.nextInt();
		System.out.println("Ingresa tu estatura");
		double estatura=scanner.nextDouble();
		
	}
}
