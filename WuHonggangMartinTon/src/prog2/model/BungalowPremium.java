package prog2.model;

public class BungalowPremium extends Bungalow {
    private boolean serveisExtra = true;
    private String codiWifi;

    public BungalowPremium(String nom, String idAllotjament,long estadaMinAlta, long estadaMinBaixa, String mida,
                           int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv,
                           boolean aireFred, boolean serveisExtra,String codiWifi) {
        super(nom, idAllotjament,estadaMinAlta, estadaMinBaixa, mida, habitacions, placesPersones,placesParquing,
                terrassa, tv, aireFred ); // Usamos 0 como valores predeterminados
        this.serveisExtra = serveisExtra;
        this.codiWifi = codiWifi;
    }

    public boolean isServeisExtra(){
        return this.serveisExtra;
    }

    public String getCodiWifi(){
        return this.codiWifi;
    }

    public void setServeisExtra(boolean serveisExtra){
        this.serveisExtra=serveisExtra;
    }

    public void setCodiWifi(String codiWifi){
        this.codiWifi=codiWifi;
    }
}
