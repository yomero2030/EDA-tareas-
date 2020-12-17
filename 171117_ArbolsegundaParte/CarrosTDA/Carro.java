public class Carro{
    String nombre;
    float peso;
    
    
    public Carro(){
        
    }

    public Carro(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "\n Carro:  "  + ", nombre: " + nombre + ", peso: " + peso + " ";
    }
}