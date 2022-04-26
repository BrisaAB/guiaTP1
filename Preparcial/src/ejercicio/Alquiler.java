package ejercicio;
import  java.util.Calendar;
import java.util.Vector;
public class Alquiler {
	//Atributos 
	private Float precio;
	private Calendar desde;
	private Calendar hasta;
	private Hospedaje aHospedaje;
	private AirBnB aAirBnB;
	private Huesped huespResponsable;
	private Vector<Huesped> grupo;
	//Constructor
	public Alquiler(Float precio, Calendar desde, Calendar hasta, Hospedaje aHospedaje, AirBnB aAirBnB,
			Huesped huespResponsable) {
		super();
		this.precio = precio;
		this.desde = desde;
		this.hasta = hasta;
		this.aHospedaje = aHospedaje;
		this.aAirBnB = aAirBnB;
		this.huespResponsable = huespResponsable;
		this.grupo = new Vector<Huesped>();
	}
	//Comportamiento
	public void agregarHuesped(Huesped huesped) {
		grupo.add(huesped);
	}
	public Boolean tieneComen5Es() {
		Boolean respuesta = false;
		for(Huesped oHuesped : grupo) {
			if(oHuesped.tienecomenNestrella(5)) {
				respuesta = true;
			}
		}
		return respuesta;
	}
	public Boolean perteneceAnio(Short anio) {
		return (anio.equals(desde.get(Calendar.YEAR))||anio.equals(hasta.get(Calendar.YEAR)));
		
	}
	public void mostrarHospedaje() {
		aHospedaje.mostrarDireccion();
	}
	public void mostrarNestrella(Short N) {
		for(Huesped oHuesped : grupo) {
			if(oHuesped.tienecomenNestrella(N)) {
				oHuesped.mostrarComenNestrellas(N);
				System.out.print(" - ");
				this.mostrarHospedaje();
				System.out.println();
			}
		}
	}
}
