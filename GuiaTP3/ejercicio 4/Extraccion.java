package ejercicio4;
public class Extraccion extends Transaccion {

    private Monto myMonto;

	public Extraccion(Monto myMonto) {
		super();
		this.myMonto = myMonto;
	}
    
	@Override
	public devolverMontoPesos() {
		return myMonto.devolverMontoPesos();
	}

}