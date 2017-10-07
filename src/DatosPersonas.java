
public class DatosPersonas {
	private String nombre_usuario;
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
	public String getnombre_usuario() {
	    return nombre_usuario;
	}
	public void setnombre(String nombre_usuario) {
	    this.nombre_usuario = nombre_usuario;
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
