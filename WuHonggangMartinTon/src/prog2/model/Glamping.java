package prog2.model;

public class Glamping extends Casa{
    String material;
    boolean casaMascotes;

    public Glamping(String material, boolean casaMascotes) {
        super(mida, habitacions, capacitat);
        this.material = material;
        this.casaMascotes = casaMascotes;
    }
}
