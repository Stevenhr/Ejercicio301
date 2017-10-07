
public class DatosPersonas {
	private String nombre_uno;
	private String apellido;
	private int cedula;
	private int edad;
	private int telefono;
	public DatosPersonas(String nombre,String apellido, int cedula,int edad,int telefono) {
		this.setnombre(nombre);
		this.setapellido(apellido);
		this.setcedula(cedula);
		this.setedad(edad);
		this.settelefono(telefono);
		
		
	}
	public String getnombre() {
	    return nombre_uno;
	}
	public void setnombre(String nombre) {
	    this.nombre_uno = nombre;
	}
	public String getapellido() {
	    return apellido;
	}
	public void setapellido(String apellido) {
	    this.apellido = apellido;
	}
	public int getcedula() {
	    return cedula;
	}
	public void setcedula(int cedula) {
	    this.cedula = cedula;
	}
	public int getedad() {
	    return edad;
	}
	public void setedad(int edad) {
	    this.edad = edad;
	}
	public int gettelefono() {
	    return telefono;
	}
	public void settelefono(int telefono) {
	    this.telefono = telefono;
	}
}
