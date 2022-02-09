package instituto;

/**
 * Clase que modela un profesor de un centro educativo.
 * 
 * @author MartinGF
 *
 */
public class Profesor extends Persona {

	/**
	 * El salario que cobra el profesor, en euros
	 */
	private int salario;
	
	/**
	 * @param nombre     El nombre del profesor
	 * @param edad    La edad del profesor
	 * @param salario  El salario anual, en euros, del profesor
	 */
	public Profesor(String nombre, int edad, int salario) {
		super(nombre, edad);
		this.salario = salario;
	}

	/**
	 * @return el salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param salario Salario a establecer
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profesor [salario=" + salario + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}
