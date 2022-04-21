package ejercicio4;
public class Moneda {

  private String descripcion;

  private Float cotizacion;

  
  public Moneda(String descripcion, Float cotizacion) {
	super();
	this.descripcion = descripcion;
	this.cotizacion = cotizacion;
}


  public Float convertirAPeso(Float monto) {
	  return monto*this.cotizacion;
  }

}