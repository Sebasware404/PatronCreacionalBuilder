package co.unicauca.builder;
import java.util.Scanner;


public class ClienteMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//el director
		ProjectDirector director = new ProjectDirector();
		//el builder concreto
		ProjectBuilder research_projectbuilder = new ResearchProjectBuilder();

		director.setProjectBuilder(research_projectbuilder);

		//datos del proyecto
		System.out.print("Ingrese el título del proyecto: ");
        String titulo = sc.nextLine();

        System.out.print("Ingrese el nombre del estudiante 1: ");
        String estudiante1 = sc.nextLine();


        System.out.print("Ingrese el nombre del estudiante 2 (opcional): ");
        String estudiante2 = sc.nextLine();
        if (estudiante2.isEmpty()) {
            estudiante2 = null; // manejar como nulo si no se proporciona
        }

		System.out.print("Ingrese la fecha de creación (dd/mm/yyyy): ");
        String fecha = sc.nextLine();

		System.out.print("Ingrese el nombre del director: ");
        String nameDirector = sc.nextLine();

		System.out.print("Ingrese el nombre del codirector 1 (opcional): ");
        String codirector1 = sc.nextLine();
		String codirector2 = null;

        if (codirector1.isEmpty()) {
            codirector1 = null;
        }else{
			System.out.print("Ingrese el nombre del codirector 2 (opcional): ");
        	codirector2 = sc.nextLine();
			
		}

		System.out.print("Ingrese el objetivo general: ");
        String objGeneral = sc.nextLine();

        System.out.print("Ingrese el número de objetivos específicos (maximo 4): ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea

        String[] objetivos = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Objetivo " + (i+1) + ": ");
            objetivos[i] = sc.nextLine();
        }

		//construcción del proyecto
		director.buildProject(titulo, estudiante1, estudiante2, fecha, nameDirector, codirector1, codirector2, objGeneral, objetivos);
		//obtener el proyecto construido
		Project project = director.getProject();
		System.out.println("Proyecto de investigación:" + project);
		
		
		sc.close();

	}
}
