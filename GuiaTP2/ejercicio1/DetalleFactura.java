package ejercicio1;

public class DetalleFactura {

  public Integer unidades;

  public Float precioUnitario;

      public Producto myProducto;

  public Float calcularTotal() {
	  
	  return unidades*precioUnitario;
  }

}