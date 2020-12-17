public class Carro {
    private String name;
    private String marca;
    
    public Carro(String name, String marca) {
        this.name = name;
        this.marca = marca;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro: marca= " + marca + ", name= " + name + "]";
    }
    

}
