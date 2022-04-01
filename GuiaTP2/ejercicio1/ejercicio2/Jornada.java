package ejercicioo2;
import java.util.Calendar;
public class Jornada {

  private Integer horas;

  private Calendar fecha;
  
  public Jornada(Integer horas, Calendar fecha) {
	this.horas = horas;
	this.fecha = fecha;
}
public Integer mostrarHoras() {
	return horas;
}
public Boolean pertenecePeriodo(Calendar periodo) {
	Boolean respuesta = false;
	if(periodo.get(periodo.MONTH) == fecha.get(fecha.MONTH) && periodo.get(periodo.YEAR) == fecha.get(fecha.YEAR) ) {
		respuesta = true;
	}
	return respuesta;
  }
  
}