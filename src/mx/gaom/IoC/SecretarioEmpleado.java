package mx.gaom.ioc;

public class SecretarioEmpleado implements IEmpleados {

	private ICreacionInformes informeNew;

	private String email;

	private String nombreEmpresa;

	/**
	 * @param informeNuevo the informeNuevo to set
	 */
	public void setValueToInformeNuevo(ICreacionInformes informe) {
		this.informeNew = informe;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String e) {
		this.email = e;
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
	public void setNombreEmpresa(String ne) {
		this.nombreEmpresa = ne;
	}

	@Override
	public String getTareas() {
		return "Gestionar la agenda de los Jefes";
	}

	@Override
	public String getInforme() {
		return "Reporte generado por el Secretario: " + informeNew.getInforme();
	}

}
