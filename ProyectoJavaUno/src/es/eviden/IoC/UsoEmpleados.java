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
		Empleado Pepito = contexto.getBean("miEmpleado",Empleado.class);
		System.out.println("Pepito: "+Pepito.getTareas());
		Empleado Pepe = contexto.getBean("miEmpleado2",Empleado.class);
		System.out.println("Pepe: "+Pepe.getTareas());
		Empleado Pepa = contexto.getBean("miEmpleado3",Empleado.class);
		System.out.println("Pepa: "+Pepa.getTareas());
		contexto.close();
	}

}
