package mx.gaom.IoC;

public class SecretarioEmpleado implements IEmpleados {

	private ICreacionInformes informeNew;

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

	/**
	 * @param informeNuevo the informeNuevo to set
	 */
	public void setValueToInformeNuevo(ICreacionInformes informe) {
		this.informeNew = informe;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los Jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Reporte generado por el Secretario: " + informeNew.getInforme();
	}

}
