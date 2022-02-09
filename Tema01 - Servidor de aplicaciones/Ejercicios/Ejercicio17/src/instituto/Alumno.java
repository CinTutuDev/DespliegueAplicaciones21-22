package instituto;

/**
 * Clase que modela un alumno de un centro educativo.
 * 
 * @author MartinGF
 *
 */
public class Alumno extends Persona{

	/**
	 * Almacena el último numExpediente que fue almacenado 
	 */
	static int numExpedienteActual = 0;
	
	/**
	 * El número de expediente del alumno
	 */
	private int numExpediente;
	
	/**
	 * @param nombre El nombre del alumno
	 * @param edad La edad del alumno
	 */
	public Alumno(String nombre, int edad) {
		super(nombre, edad);
		Alumno.numExpedienteActual++;
		this.numExpediente = Alumno.numExpedienteActual;
	}

	/**
	 * @return El numExpediente
	 */
	public int getNumExpediente() {
		return numExpediente;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alumno [numExpediente=" + numExpediente + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}
