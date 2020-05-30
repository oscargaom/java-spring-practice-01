package mx.gaom.IoC;

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
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

		DirectorEmpleado juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		System.out.println(juan.getInforme());

		contexto.close();		
	}
}
