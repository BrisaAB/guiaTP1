package ejercicio1;
import java.util.Vector;

public class Empresa {

  private String nombre;

    /**
   * 
   * @element-type Factura
   */
  private Vector<Factura>  myFactura;
  private IVA myIVA;
    /**
   * 
   * @element-type Cliente
   */
  private Vector<Cliente>  myCliente;
    /**
   * 
   * @element-type Producto
   */
  private Vector<Producto>  myProducto;

  public void calcularTotalFacturas() {
	  Float totalFacturas = 0f;
	  
  }

}