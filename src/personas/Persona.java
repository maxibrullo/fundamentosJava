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

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public static int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                '}';
    }
}
