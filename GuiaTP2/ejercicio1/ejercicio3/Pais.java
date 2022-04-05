package ejercicio3;
public class Pais {

  public String nombre;

  public Float impuesto;

    /**
   * 
   * @element-type Auto
   */

  public Boolean esArgentina() {
	  Boolean respuesta = false;
	  if(nombre.contentEquals("Argentina")) {
		  respuesta = true;
	  }
	  
	  return respuesta;
  }

}