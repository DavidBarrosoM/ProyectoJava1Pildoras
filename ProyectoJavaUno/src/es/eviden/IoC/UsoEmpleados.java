package es.eviden.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		/*
		// Creación objetos empleado
		Empleado empleado1 = new JefeEmpleado();
		Empleado empleado2 = new SecretarioEmpleado();
		Empleado empleado3 = new DirectorEmpleado();
		//Uso de los objetos
		System.out.println(empleado1.getTareas());
		System.out.println(empleado2.getTareas());
		System.out.println(empleado3.getTareas());
		*/
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("aplicationContext.xml");
		
	}

}
