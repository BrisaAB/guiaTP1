package ejercicioo2;
import java.util.Calendar;
public abstract class Trabajador {

  private String nombre;

  private String apellido;

  private Integer dni;

  private String direccion;
  
  

  
  public Trabajador(String nombre, String apellido, Integer dni, String direccion) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.direccion = direccion;
}




public abstract Float calcularSueldo(Calendar periodo);
	
}