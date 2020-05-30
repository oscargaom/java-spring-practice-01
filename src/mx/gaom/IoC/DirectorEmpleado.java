package mx.gaom.IoC;

/**
 * @author oscar
 *
 */
public class DirectorEmpleado implements IEmpleados {

	private ICreacionInformes informeNuevo;

	private String email;

	private String nombreEmpresa;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public DirectorEmpleado(ICreacionInformes informeNuevo) {
		// TODO Auto-generated constructor stub
		this.informeNuevo = informeNuevo;
	}

	public void init() {
		System.out.println("Método que se ejecuta antes de la carga del bean.");
	}

	public void destroy() {
		System.out.println("Método que se ejecuta cuando el bean ha sido utilizado.");
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
