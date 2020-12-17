import java.util.Comparator;

public class Persona implements  Comparator <Persona>, Comparable<Persona> {

    private String name;
    private String passport;
    private String lastName;
    private String  pais;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Persona(String name, String passport, String lastName, String pais) {
        this.name = name;
        this.passport = passport;
        this.lastName = lastName;
        this.pais = pais;
    }

    public Persona(){
        
    }

    @Override
    public int compare(Persona arg0, Persona arg1) {
        // TODO Auto-generated method stub
        String apellidosA= arg0.getLastName();
        String apellidosB = arg1.getLastName();
        return  apellidosA.compareTo(apellidosB);
    }

    @Override
    public int compareTo(Persona arg0) {
        // TODO Auto-generated method stub
        return 0;
        
    }






        


}