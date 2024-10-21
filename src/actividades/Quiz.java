package actividades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Quiz extends Actividad {
	
	List<PreguntaCerrada> preguntas;
	double calificacionMin;
	
	public Quiz(String descripcion, String objetivo, String nivelDificultad, int duracion,
			 Date fechaLim,double calificacionMin, boolean obligatoria) {
		super("Quiz",descripcion, objetivo, nivelDificultad, duracion, fechaLim, obligatoria);
		
		this.preguntas = new ArrayList<>();
		this.calificacionMin = calificacionMin;
	}
	
	public void menu() {
		
	}

	public void addPregunta(PreguntaCerrada pregunta) {
		this.preguntas.add(pregunta);
	}

	@Override
	public void completar() {
		double notaObtenida = evaluarQuiz();
        if (notaObtenida >= notaAprobatoria) {
            setCompletado(true);  // Utiliza el setter
            System.out.println("Quiz aprobado con nota: " + notaObtenida);
        } else {
            System.out.println("Quiz reprobado con nota: " + notaObtenida);
        }
	}
	

}

