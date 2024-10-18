package es.juliogtrenard.gestionarpersonasv3.modelos;

/**
 * Clase que representa a una persona con nombre, apellidos y edad.
 */
public class Persona {
    /**
     * Nombre de la persona.
     */
    private String nombre;

    /**
     * Apellidos de la persona.
     */
    private String apellidos;

    /**
     * Edad de la persona.
     */
    private int edad;

    /**
     * Constructor que inicializa los atributos de la persona.
     *
     * @param nombre    El nombre de la persona.
     * @param apellidos Los apellidos de la persona.
     * @param edad      La edad de la persona.
     */
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene los apellidos de la persona.
     *
     * @return Los apellidos de la persona.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }
}
