package ejercicio3;
public class Auto extends Vehiculo {

    public Pais myPais;
    @Override
    public Boolean esAuto() {
    	return true;
    }
    @Override
    public Boolean esNacional() {
    	Boolean respuesta = false;
    	if(myPais.esArgentina()) {
    		respuesta = true;
    	}
    	return respuesta;
    }
}