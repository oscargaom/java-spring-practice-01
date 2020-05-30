package mx.gaom.IoC;

public class JefeEmpleado implements IEmpleados {
	
	private ICreacionInformes informeNuevo;
	
	public JefeEmpleado(ICreacionInformes informeNuevo) {
		super();
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {	
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el Jefe con rectificaciones: " + informeNuevo.getInforme();
	}
	
}
