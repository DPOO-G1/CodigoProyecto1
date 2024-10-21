package usuarios;

import java.util.List;

import actividades.Actividad;
import learningPath.LearningPath;
import java.util.ArrayList;

public class Estudiante extends Usuario {
	
	private List<LearningPath> learningPaths;
    private LearningPath learningPathActivo; // Solo puede haber un Learning Path activo
    private Actividad actividadActual; // Solo una actividad a la vez

	public Estudiante(String nombre, String correo, String password) {
		super(nombre, correo, password);
		this.learningPaths = new ArrayList<>();
        
	}
	
	@Override
	public void menu() {
		System.out.println("Menú Estudiante");
        
        System.out.println("1. Ver Learning Paths");
        System.out.println("2. Realizar una tarea");
	}
	
	public void inscribirEnLearningPath(LearningPath path) {
        learningPaths.add(path);
        if (learningPathActivo == null) {
            learningPathActivo = path;  // Asigna el primer Learning Path como activo
        }
        System.out.println("Estudiante inscrito en el Learning Path: " + path.getTitulo());
    }

    public void iniciarActividad(Actividad actividad) {
        if (actividadActual != null) {
            System.out.println("Ya tienes una actividad en progreso. Completa esa primero.");
        } else {
            actividadActual = actividad;
            System.out.println("Actividad iniciada: " + actividad.getDescripcion());
        }
    }

    public void completarActividadActual() {
        if (actividadActual == null) {
            System.out.println("No tienes ninguna actividad en progreso.");
        } else {
            actividadActual.completar();
            actividadActual = null;
        }
    }

    public void mostrarProgreso() {
        for (LearningPath path : learningPaths) {
            System.out.println("Learning Path: " + path.getTitulo() + " - Progreso: " + path.calcularProgreso() + "%");
        }
    }
}
