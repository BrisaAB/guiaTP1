package ejercicioo2;
import java.util.Vector;
import java.util.Calendar;
public class Empresa {

    /**
   * 
   * @element-type Trabajador
   */
  public Vector<Trabajador>  myTrabajador;
  public Empresa() {
	  this.myTrabajador = new Vector<Trabajador>();
  }
  public void addTrabajador(Trabajador trabajador) {
	  myTrabajador.add(trabajador);
  }

  public Float calcularSueldos(Calendar periodo) {
	  Float sueldos = 0f;
	  for (Trabajador oTrabajador : myTrabajador) {
		  sueldos += oTrabajador.calcularSueldo(periodo);
	  }
	  return sueldos;
  }

}