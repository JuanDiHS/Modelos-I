//Estado intrinseco del objeto (Común a todos los objetos)

public class Curso {
	    private String nombre;
	    private String codigo;

	    public Curso(String nombre, String codigo) {
	        this.nombre = nombre;
	        this.codigo = codigo;
	    }

	    public String mostrarInfo() {
	        return "Curso: " + nombre + ", Código: " + codigo;
	    }
	}

	
	


