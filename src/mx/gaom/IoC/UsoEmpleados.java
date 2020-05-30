package mx.gaom.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Empleados empleado1 = new DirectorEmpleado();
		 * 
		 * System.out.println(empleado1.getTareas());
		 */

		/*
		 * ClassPathXmlApplicationContext contexto = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 * 
		 * IEmpleados juan = contexto.getBean("miEmpleado", IEmpleados.class);
		 * 
		 * System.out.println(juan.getTareas());
		 * 
		 * System.out.println(juan.getInforme()); 
		 * 
		 * contexto.close();
		 */
		
		/*
		 * ClassPathXmlApplicationContext contexto = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 * 
		 * SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado",
		 * SecretarioEmpleado.class);
		 * 
		 * System.out.println(maria.getTareas());
		 * 
		 * System.out.println(maria.getInforme());
		 * 
		 * System.out.println("Email: " + maria.getEmail());
		 * 
		 * System.out.println("Nombre de empresa: " + maria.getNombreEmpresa());
		 * 
		 * contexto.close();
		 */
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		DirectorEmpleado juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		System.out.println(juan.getTareas());

		System.out.println(juan.getInforme());

		System.out.println("Email: " + juan.getEmail());

		System.out.println("Nombre de empresa: " + juan.getNombreEmpresa());
		
		contexto.close();
		
	}

}
