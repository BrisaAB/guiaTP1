package ejercicio3;
import java.util.Vector;

public class Venta {

    /**
   * 
   * @element-type Vehiculo
   */
  public Vector<DetalleVenta> myDetalleVenta;
  
  public Boolean esVtaAuto() {
	  Boolean esAuto = false;
	  int ite = 0;
	  while ((esAuto == false) && ite != myDetalleVenta.size()) {
		  DetalleVenta obdetalle = myDetalleVenta.get(ite);
		 //IMPLEMENTAR TODO ESTO
		  
		  ite += 1;
		  
	  }
  }

  public Boolean esVtaConDueno() {
  return null;
  }

  public Float calcularTotal() {
  return null;
  }

  public Boolean esVtaNacional() {
  return null;
  }

}