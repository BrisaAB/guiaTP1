package ejercicio4;
public class Deposito extends Transaccion {

    private Monto myMonto;

	public Deposito(Monto myMonto) {
		super();
		this.myMonto = myMonto;
	}
    
    @Override
    public devolverMontePesos() {
    	return myMonto.devolverMontoPesos();
    }
}