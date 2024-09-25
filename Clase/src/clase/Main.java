package clase;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del alumno: ");
		
		String nombreAlumno = scanner.nextLine();
		
		System.out.println("El nombre del alumno es: " + nombreAlumno);
		
		
		System.out.println("5 notas de clase "); 
		
	    System.out.println("Introduce la nota de la asignatura: ");
		int nota1 =  scanner.nextInt();
		System.out.println("Introduce la nota de la asignatura: ");
		int nota2 =  scanner.nextInt();
		System.out.println("Introduce la nota de la asignatura: ");
		int nota3 =  scanner.nextInt();
		System.out.println("Introduce la nota de la asignatura: ");
		int nota4 =  scanner.nextInt();
		System.out.println("Introduce la nota de la asignatura: ");
		int nota5 =  scanner.nextInt();
		
		
	    int sumarNotas = nota1 + nota2 + nota3 + nota4 + nota5;
		int notaMedia = sumarNotas / 5;
		System.out.println("Nota media de las cinco notas es: " + notaMedia);
		if (notaMedia >=5) {
			System.out.println("Ha aprobado el año");
			
		} else {
			System.out.println("No ha aprobado el año");
		}

		
		
		

		
		
	}

}
