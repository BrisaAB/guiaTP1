package ejercicio4;
public class Monto {

  private Float monto;

  private Float monto_pesos;

 private Moneda myMoneda;
  
  
  
  public Monto(Float monto, Moneda myMoneda) {
	super();
	this.monto = monto;
	this.myMoneda = myMoneda;
	this.monto_pesos = myMoneda.convertirAPeso(monto);
}
  public Float devolverMontoPesos() {
	  return monto_pesos;
  }



}