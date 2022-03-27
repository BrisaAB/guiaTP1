package ejercicios1_2y4;
import java.util.Calendar;
import java.time.*;
public class Persona {
	//atributos
	private String nombre;
	private Integer doc;
	private Calendar nac;
	private String claveSha;
	//constructor 
	public Persona(String nombre, Integer doc, Calendar fechanac, String clave) {
		this.nombre = nombre;
		this.doc = doc;
		this.nac = fechanac;
		this.claveSha = StringMD.getStringMessageDigest(clave, StringMD.SHA256);
	}
	//comportamiento
	private Integer edad() {
		Calendar fecha = Calendar.getInstance();
		if(fecha.get(fecha.DAY_OF_YEAR)-this.nac.get(nac.DAY_OF_YEAR)<0) {
			return fecha.get(1)-this.nac.get(1)-1;
		}else {
			return fecha.get(1)-this.nac.get(1);
		}
	}
	public String mostrar() {
		return this.nombre+": "+ edad() + " años. "+this.nac.get(nac.DAY_OF_YEAR);
	}
	public boolean validarPassword(String clave) {
		String test = StringMD.getStringMessageDigest(clave, StringMD.SHA256);
		return test.equals((this.claveSha));
	}
	public String validarPasswordString(String clave) {
		String test = StringMD.getStringMessageDigest(clave, StringMD.SHA256);
		if(test.equals(this.claveSha)) {
			return "Verdadero";
		}
		return "Falso";
	}
}
