package mx.gaom.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author oscar
 *
 */
public class UsoCicloVidaBean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

		DirectorEmpleado juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		System.out.println(juan.getInforme());

		contexto.close();		
	}
}
