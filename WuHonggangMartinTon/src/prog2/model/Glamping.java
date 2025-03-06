package prog2.model;


public class Glamping extends Casa{
    private String material;
    private boolean casaMascotes;

    public Glamping(String nom, String idAllotjament, long estadaMinAlta,
            long estadaMinBaixa, String mida, int habitacions, int placesPersones,String material,
                    boolean casaMascotes) {
        super(nom ,idAllotjament , estadaMinAlta, estadaMinBaixa,mida,habitacions,placesPersones);
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
}
