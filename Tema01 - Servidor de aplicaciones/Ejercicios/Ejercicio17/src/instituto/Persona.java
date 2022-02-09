package instituto;

/**
 * Clase que permite modelar una persona.
 * 
 * @author MartinGF
 *
 */
public class Persona {
	/**
	 * El nombre de la persona
	 */
	protected String nombre;
	
	/**
	 * La edad de la persona
	 */
	protected int edad;

	/**
	 * @param nombre Nombre que se le asignará a la persona
	 * @param edad Edad que se lle asignará a la persona
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre Nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad Edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
