package ejercicioo2;
import java.util.Vector;
import java.util.Calendar;

public class Jornalizado extends Trabajador {

  private Vector<Jornada>  myJornada;
  private Vector<HorasJornal>  myHorasJornal;
  private Jefe myJefe;
public Jornalizado(String nombre, String apellido, Integer dni, String direccion, Jefe myJefe) {
	super(nombre, apellido, dni, direccion);
	this.myJornada = new Vector<Jornada>();
	this.myHorasJornal = new Vector<HorasJornal>();
	this.myJefe = myJefe;
}
@Override
public Float calcularSueldo(Calendar periodo) {
	Integer horasTrabajadas = 0;
	for(Jornada oJornada:myJornada) {
		if(oJornada.pertenecePeriodo(periodo)) {
			horasTrabajadas += oJornada.mostrarHoras();
		}
	}
	Float sueldo = 0f;
	for (HorasJornal oHorasJornal:this.myHorasJornal) {
		if(oHorasJornal.pertenecePeriodo(periodo)) {
			sueldo += oHorasJornal.calcularSueldoHoras(horasTrabajadas);
		}
		
	}
	return sueldo;
	
		
}
  
}