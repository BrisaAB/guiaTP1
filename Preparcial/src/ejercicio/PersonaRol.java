package ejercicio;

public abstract class PersonaRol { //No esta abstracto en el UML, pero lo puse igual
	//Atributos 
	private Persona persona;
	//Comportamiento
	public Boolean tienecomenNestrella(Short N) {
		return persona.tieneComenNestrellas(N);
	}
	public void mostrarComenNestrellas(Short N) {
		persona.mostrarComentarioestrellas(N);
	}
}
