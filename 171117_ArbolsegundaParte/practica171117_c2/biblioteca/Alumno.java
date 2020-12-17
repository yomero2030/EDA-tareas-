public class Alumno {
    
    String matricula;
    String libro;

    public Alumno() {}

    public Alumno(String matricula, String libro) {
        this.matricula = matricula;
        this.libro = libro;
    }

    public Alumno(String matricula) {
        this.matricula = matricula;
    }


    public String getmatricula() {
        return matricula;
    }

    public void setmatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }


    @Override
    public String toString() {
        String mensaje = "Matricula: " + matricula +  " Libro: " + libro  + "\n";
        return mensaje;
        
    }
}
