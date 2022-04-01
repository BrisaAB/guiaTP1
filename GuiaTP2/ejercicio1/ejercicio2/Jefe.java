package ejercicioo2;
import java.util.Calendar;
public class Jefe extends Trabajador {

  private Float sueldo;

    /**
   * 
   * @element-type Jornalizado
   */
    /**
   * 
   * @element-type Mensualizado
   */
  public Jefe(String nombre, String apellido, Integer dni, String direccion, Float sueldo) {
		super(nombre, apellido, dni, direccion);
		this.sueldo = sueldo;
	}  
@Override
  public Float calcularSueldo(Calendar periodo) {
	return sueldo;
  }



}