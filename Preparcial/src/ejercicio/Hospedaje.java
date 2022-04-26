package ejercicio;
import java.util.Vector;

public class Hospedaje {
//Atributos
	private Vector<Alquiler> vAlquileres;
	private Integer capacidad;
	private String direccion;
	private Anfitrion aAnfitrion;
//Comportamiento
	public void mostrarDireccion() {
		System.out.print(direccion);
	}
}
