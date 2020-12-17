public class Persona {

    private String name, curp;


     Persona(String name, String curp){
        this.name = name;
        this.curp = curp;
    }

    public void setName(String name){
        this.name = name;

    }

    public void setCurp(String curp ){
        this.curp= curp;
    }

    public String getName(){
        return name;
    }

    public String getCurp(){

        return curp;
    }
    
}
