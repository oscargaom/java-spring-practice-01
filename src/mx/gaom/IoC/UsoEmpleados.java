package mx.gaom.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
	public static void main(String[] args) {

		String file = "applicationContext.xml";

		prueba1(file);
		prueba2(file);
		prueba3(file);
	}

	public static void prueba1(String file) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext(file);

		IEmpleados juan = contexto.getBean("miEmpleado", IEmpleados.class);

		System.out.println(juan.getTareas());

		System.out.println(juan.getInforme());

		contexto.close();
	}

	public static void prueba2(String file) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext(file);

		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		System.out.println(maria.getTareas());

		System.out.println(maria.getInforme());

		System.out.println("Email: " + maria.getEmail());

		System.out.println("Nombre de empresa: " + maria.getNombreEmpresa());

		contexto.close();

	}

	public static void prueba3(String file) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext(file);

		DirectorEmpleado juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		System.out.println(juan.getTareas());

		System.out.println(juan.getInforme());

		System.out.println("Email: " + juan.getEmail());

		System.out.println("Nombre de empresa: " + juan.getNombreEmpresa());

		contexto.close();
	}
}
