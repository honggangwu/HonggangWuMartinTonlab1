package prog2.model;

public class Parcela extends Allotjament {
    int mida;
    boolean connexio;

    public Parcela(String nom, String id, int estadaMinAlta, int estadaMinBaixa, int mida, boolean connexio) {
        super(nom, id, estadaMinAlta, estadaMinBaixa);
        this.mida = mida;
        this.connexio = connexio;
    }

    // GETTERS I SETTERS
    public int getMida(){
        return this.mida;
    }
    public void setMida(int mida){
        this.mida = mida;
    }
    public boolean getConnexio(){
        return this.connexio;
    }
    public void setConnexio(boolean connexio){
        this.connexio = connexio;
    }
}