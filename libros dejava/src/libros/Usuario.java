package libros;

public class Usuario {
private String nombres;
private String apellidos;
private String correo;
private int edad;
/**
 * @param nombres
 * @param apellidos
 * @param correo
 * @param edad
 */
public Usuario(String nombres, String apellidos, String correo, int edad) {
	super();
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.correo = correo;
	this.edad = edad;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

	
}
