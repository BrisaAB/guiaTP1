package ejercicio4;
import java.util.Vector;

public class Cuenta {

  private Integer numero;

    public Titular myTitular;
      /**
   * 
   * @element-type Transaccion
   */
  public Vector<Transaccion>  myTransaccion;

  public Integer cantTransPeriodo(Calendar periodo) {
	 Integer contador = 0;
	 for(Transaccion oTrans : myTransaccion) {
		 contador +=1;
	 }
	  return null;
  }

  public Float sumaTransPeriodo(Calendar periodo) {
  return null;
  }

  public Float calcularComision(Calendar periodo) {
  return null;
  }

  public void mostrarComision(Calendar periodo) {
  }

}