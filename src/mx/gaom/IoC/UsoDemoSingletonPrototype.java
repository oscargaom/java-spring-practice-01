package mx.gaom.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		SecretarioEmpleado juan = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		System.out.println(juan);
		System.out.println(maria);

		if (maria == juan) {
			System.out.println("Apuntan al mismo objeto");
		} else {
			System.out.println("No apuntan al mismo objeto");
		}
		
		contexto.close();
	}

}
