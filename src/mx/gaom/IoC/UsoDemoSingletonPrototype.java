package mx.gaom.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
