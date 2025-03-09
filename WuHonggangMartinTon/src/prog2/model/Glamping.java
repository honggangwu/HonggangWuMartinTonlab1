package prog2.model;


public class Glamping extends Casa{
    private String material;
    private boolean casaMascotes;

    public Glamping(String nom, String idAllotjament,
                    String mida, int habitacions, int placesPersones,String material,
                    boolean casaMascotes) {
        super(nom ,idAllotjament,5,3, mida, habitacions, placesPersones);
        this.material = material;
        this.casaMascotes = casaMascotes;
    }

    public String getMaterial(){
        return this.material;
    }

    public boolean isCasaMascotes(){
        return this.casaMascotes;
    }

    public void setMaterial(String material){
        this.material=material;
    }

    public void setCasaMascotes(boolean casaMascotes){
        this.casaMascotes=casaMascotes;
    }

    @Override
    public boolean correcteFuncionament() {
        return this.casaMascotes;
    }


    public String toString() {
        return "Nom=" + getNom() + ", Id=" + getId() +
                ", estada mínima en temp ALTA: " + getEstadaMinima(Temp.ALTA) +
                ", estada mínima en temp BAIXA: " + getEstadaMinima(Temp.BAIXA) +
                " Glamping { mida=" + getMida() +
                ", habitacions=" + getHabitacions() +
                ", places persones=" + getPlacesPersones() +
                ", material=" + getMaterial() +
                ", casa mascotes=" + isCasaMascotes() + " }";
    }

}
