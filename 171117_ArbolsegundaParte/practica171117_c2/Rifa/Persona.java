
public class Persona {
    String nombre;
    String apellidos;
    String numeroTApa;
    String fecha;

    public Persona(){

    }

    public Persona(String nombre, String apellidos, String numeroTApa, String fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroTApa = numeroTApa;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroTApa() {
        return numeroTApa;
    }

    public void setNumeroTApa(String numeroTApa) {
        this.numeroTApa = numeroTApa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona [apellidos=" + apellidos + ", fecha=" + fecha + ", nombre=" + nombre
                + ", numeroTapa=" + numeroTApa + "]";
    }
    




}
