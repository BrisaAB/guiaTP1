package ejercicioo2;
import java.util.Calendar;
public class Mensualizado extends Trabajador {

    public Categoria myCategoria;
    public Jefe myJefe;
	public Mensualizado(String nombre, String apellido, Integer dni, String direccion, Categoria myCategoria,
			Jefe myJefe) {
		super(nombre, apellido, dni, direccion);
		this.myCategoria = myCategoria;
		this.myJefe = myJefe;
	}
    @Override
    public Float calcularSueldo(Calendar periodo) {
    	return 0f;
    }

}