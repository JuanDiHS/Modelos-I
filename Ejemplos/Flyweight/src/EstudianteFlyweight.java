import java.util.List;

//Controlador

public class EstudianteFlyweight {

	public static void main(String[] args) {
		Curso cursoMatematicas = CursoFactory.obtenerCurso("Matemáticas", "MAT101");

        Estudiante estudiante1 = new Estudiante("Ana", List.of(90, 85, 88), cursoMatematicas);
        Estudiante estudiante2 = new Estudiante("Carlos", List.of(75, 80, 79), cursoMatematicas);

        // Crear estudiantes en el curso de Física
        Curso cursoFisica = CursoFactory.obtenerCurso("Física", "FIS102");

        Estudiante estudiante3 = new Estudiante("Laura", List.of(92, 89, 94), cursoFisica);

        // Mostrar información de los estudiantes
        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();
        estudiante3.mostrarInfo();

        // Verificar que el curso de Matemáticas es compartido
        System.out.println("¿cursoMatematicas es el mismo objeto? " + (cursoMatematicas == CursoFactory.obtenerCurso("Matemáticas", "MAT101")));
    }

	}

