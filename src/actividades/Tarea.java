package actividades;

import java.util.List;

public class Tarea extends Actividad {

	public Tarea(String descripcion, String objetivo, String nivelDificultad, int duracion,
			List<Actividad> actividadesPrerrequisito, String fechaLim, List<Actividad> actividadesOpcionales) {
		super(descripcion, objetivo, nivelDificultad, duracion, actividadesPrerrequisito, fechaLim, actividadesOpcionales);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void completar() {
        this.completado = true;
        System.out.println("Tarea completada: " + descripcion);
    }

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		
	}
}
