package ejercicioo2;
import java.util.Calendar;
public class HorasJornal {

  private Float menor40;

  private  Float mayor40;

  private Calendar fechadesde;

  private Calendar fechahasta;
  
  public HorasJornal(Float menor40, Float mayor40, Calendar fechadesde) {
	this.menor40 = menor40;
	this.mayor40 = mayor40;
	this.fechadesde = fechadesde;
}
public void addfechahasta(Calendar fecha) {
	this.fechahasta = fecha;
}
public Boolean pertenecePeriodo(Calendar periodo) {
	  Boolean respuesta = false;
	  if(fechadesde.getTimeInMillis()<= periodo.getTimeInMillis()&&(fechahasta.getTimeInMillis()>=periodo.getTimeInMillis()||fechahasta == null)) {
		  respuesta = true;
	  }
	  return respuesta;
  }
  
  public Float calcularSueldoHoras(Integer canthoras){
	  Float sueldo = 0f;
	  if(canthoras < 40) {
		  sueldo += canthoras*menor40;
	  }else {
		  sueldo += 40*menor40;
		  sueldo += (canthoras-40)*mayor40;
	  }
	  return sueldo;
  }

}