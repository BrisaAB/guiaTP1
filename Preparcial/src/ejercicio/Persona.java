package ejercicio;

import java.util.Vector;

public class Persona {
	//Atributos
	private String nombre;
	private String email;
	private AirBnB aAirBnB;
	private Vector<PersonaRol> roles;
	private Vector<Comentario> comentarios;
	//Comportamiento
	public Boolean tieneComenNestrellas(Short N) {
		Boolean respuesta = false;
		for (Comentario ocomen : comentarios) {
			if(ocomen.esNestrellas(N)) {
				respuesta = true;
			}
		}
		return respuesta;
	}
	public void mostrarComentarioestrellas(Short estrella) {
		for (Comentario ocomen : comentarios) {
			if(ocomen.esNestrellas(estrella)) {
				ocomen.mostrar();
			}
		}
	}
}
