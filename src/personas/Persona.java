package personas;

public class Persona {

    private String nombre;
    private Integer edad;
    private Character genero;

    private static int idPersona;

    public Persona() {
    }

    public Persona(String nombre, Integer edad, Character genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
}
