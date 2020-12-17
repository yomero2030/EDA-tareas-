

public class CajeroEmpresarial implements Comparable<CajeroEmpresarial>{
    
    private int cajero;
    private int numeroEmpresarial;

    CajeroEmpresarial(int num,int numero){ 
        this.cajero = num;
        this.numeroEmpresarial = numero;
    }


    public void setNumeroEmpresarial(int numeroEmpresarial){
        this.numeroEmpresarial= numeroEmpresarial;
    }

    public void setCajero(int cajero){
        this.cajero= cajero;
    }

    public int getCajero(){
        return cajero;
    }

    public int getNumeroEmpresarial(){
        return numeroEmpresarial;
    }

    @Override
    public int compareTo(CajeroEmpresarial cajE) {
        // TODO Auto-generated method stub
        return this.numeroEmpresarial-cajE.numeroEmpresarial;
    }

}
