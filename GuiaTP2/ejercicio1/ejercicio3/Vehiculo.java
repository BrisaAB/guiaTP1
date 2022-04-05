package ejercicio3;
public abstract class Vehiculo {

  private Integer modelo;

  private String patente;

  public Float precio;

  public Integer kilometraje;

  public Integer newAttr;

  private Dueño myDueño;
  
  private Venta<DetalleVenta> myDetalleVenta;

  public Boolean esAuto() { //ESTO TAMBIEN SE PUEDE HACER COMO public Boolean esDelTipo(Enum )
  return false;
  }

  public Boolean tieneDueno() {
	  Boolean valor = false;
	  if(myDueño != null) {
		  valor = true;
	  }
	  return valor;
  }

  public Boolean esNacional() {
  return false;
  }

}