import java.util.Map;
import java.util.HashMap;
// Clase que crea los objetos Flyweight, independiente de si existen o no
public class CursoFactory {
	private static final Map<String, Curso> cursos = new HashMap<>();

    public static Curso obtenerCurso(String nombre, String codigo) {
        String key = nombre + "-" + codigo;
        if (!cursos.containsKey(key)) {
            cursos.put(key, new Curso(nombre, codigo));
        }
        return cursos.get(key);
    }
}
