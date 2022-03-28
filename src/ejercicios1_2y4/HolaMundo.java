package ejercicios1_2y4;
import java.util.Calendar;
public class HolaMundo {
public static void main(String[]agrs) {
	Calendar nacimiento = Calendar.getInstance();
	nacimiento.set(2002, 03, 20);
	Calendar hoy = Calendar.getInstance();
	System.out.println(hoy.getTime());
	System.out.println(hoy.get(1));
	Persona unwachin = new Persona("Brisa",44177100,nacimiento,"pass");
	System.out.println(unwachin.mostrar());
	System.out.println(unwachin.validarPassword("pass"));
	System.out.println(unwachin.validarPasswordString("pass"));
	System.out.println(unwachin.validarPassword("otra"));
	System.out.println(unwachin.validarPasswordString("otra"));
}
}
