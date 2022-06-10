package ejercicio;

public class Comentario {
	//Atributos
	private String comentario;
	private Short estrellas;
	//Comportamiento
	public Boolean esNestrellas(Short N) {
		Boolean respuesta = false;
		if(estrellas.equals(N)) {
			respuesta = true;
		}
		return respuesta;
	}
	public void mostrar() {
		System.out.print(comentario + " - " + estrellas + " estrellas");
	}
}
