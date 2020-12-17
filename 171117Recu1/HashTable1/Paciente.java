public class Paciente {
   private String nombre;
   private String apellidos;
   private String curp;

   public Paciente(String nombre, String apellidos, String curp) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.curp = curp;

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

   public String getCurp() {
       return curp;
   }

   public void setCurp(String curp) {
       this.curp = curp;
   }

   @Override
   public String toString() {
       return "Paciente apellidos= " + apellidos + ", curp=" + curp + ", nombre=" + nombre ;
   }


}
