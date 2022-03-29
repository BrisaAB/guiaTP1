package ejercicio1;
import java.util.Vector;
import java.util.Calendar;

public class Factura {

  private String numero;

  private Calendar fecha;

  private Cliente myCliente;
    /**
   * 
   * @element-type DetalleFactura
   */
  private Vector<DetalleFactura>  myDetalleFactura;
  
  public Factura(String numero, Calendar fecha, Cliente myCliente, Vector<DetalleFactura> myDetalleFactura) {
		this.numero = numero;
		this.fecha = fecha;
		this.myCliente = myCliente;
		this.myDetalleFactura = myDetalleFactura;
	}

public Float calcularTotal() {
	  Float total = 0f;
	  for(DetalleFactura obj:myDetalleFactura) {
		  total += obj.calcularTotal();
	  }
	  return total;
  }

}