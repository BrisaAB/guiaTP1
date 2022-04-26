package ejercicio;

import java.util.Vector;

public class AirBnB {
	//Atributos
	private Vector<Persona> cliente;
	private Vector<Hospedaje> cHospedajes;
	private Vector<Alquiler> vAlquileres;
	
	//Constructor
	public AirBnB(Vector<Persona> cliente) {
		super();
		this.cliente = cliente;
		this.cHospedajes = new Vector<Hospedaje>();
		this.vAlquileres = new Vector<Alquiler>();
	}
	//Comportamiento
	public void mostrar5EstrekkasxAnio(Short anio) {
		for(Alquiler oAlqui : vAlquileres) {
			if(oAlqui.perteneceAnio(anio)) {
				if(oAlqui.tieneComen5Es()) {
					oAlqui.mostrarNestrella(5);
				}
			}
		}
	}

}
