package prog2.model;

public class Casa extends Allotjament {
    String mida;
    int habitacions;
    int capacitat;

    public Casa(String nom, String id, int estadaMinAlta
                ,int estadaMinBaixan, String mida, int habitacions, int capacitat) {
        super(nom, id, estadaMinAlta, estadaMinBaixan);
        this.mida = mida;
        this.habitacions = habitacions;
        this.capacitat = capacitat;
    }
}
