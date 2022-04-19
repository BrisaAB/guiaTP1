package ejercicio4;

import java.util.Calendar;

public class Transaccion {

  private Calendar fecha;

  
  public Boolean pertenecePeriodo(Calendar periodo) {
	  Boolean respuesta = false;
	  if(fecha.get(fecha.YEAR) == periodo.get(periodo.YEAR) && fecha.get(fecha.MONTH) == periodo.get(periodo.MONTH)) {
		  respuesta = true;
	  }
	  return respuesta;
  }

  public Float devolverMontoPesos() {
  return 0f;
  }

  public Boolean esExtraccion() {
  return false;
  }

}