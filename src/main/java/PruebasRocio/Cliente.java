package PruebasRocio;

public class Cliente {
    private String dni;
    private String nombrecompleto;
    private String especialidad;

    public Cliente(String dni, String nombre, String especialidad) {
        this.dni = dni;
        this.nombrecompleto = nombre;
        this.especialidad = especialidad;
    }

    public String getDni() {
        return dni;
    }
}
