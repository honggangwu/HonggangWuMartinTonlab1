package prog2.model;


import prog2.vista.ExcepcioReserva;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;


public class Camping implements InCamping{
    private String nomCamping;
    private ArrayList<Allotjament> allotjaments;
    private ArrayList<Client> clients;
    private ArrayList<Reserva> reserves;


    @Override
    public String getNom() {
        return nomCamping;
    }


    @Override
    public LlistaReserves getLlistaReserves() {
        return this.reserves;
    }


    @Override
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return allotjaments;
    }


    @Override
    public ArrayList<Client> getLlistaClients() {
        return clients;
    }


    @Override
    public int getNumAllotjaments() {
        return this.allotjaments.size();
    }


    @Override
    public int getNumReserves() {
        return this.reserves.size();
    }


    @Override
    public int getNumClients() {
        return this.clients.size();
    }


    @Override
    public void afegirClient(String nom_, String dni_) throws ExcepcioReserva {
        Client nouClient = new Client(nom_, dni_);
        clients.add(nouClient);
    }


    @Override
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        Parcela novaParcela = new Parcela(nom_, idAllotjament_, metres, connexioElectrica);
        allotjaments.add(novaParcela);
    }


    @Override
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        Bungalow nouBungalow = new Bungalow(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        allotjaments.add(nouBungalow);
    }


    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        BungalowPremium nouBungalowPremium = new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        allotjaments.add(nouBungalowPremium);
    }


    @Override
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
        Glamping glamping = new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
        allotjaments.add(glamping);
    }


    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        MobilHome mobilHome = new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones, terrassaBarbacoa);
        allotjaments.add(mobilHome);
    }


    @Override
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        Client nouClient = buscarClient(dni_);
        Allotjament nouAllotjament = buscarAllotjament(id_);


        if (nouClient == null) {
            throw new ExcepcioReserva("No existeix aquest Client");
        }
        if (nouAllotjament == null) {
            throw new ExcepcioReserva("No existeix aquest Id");
        }
    }


    @Override
    public float calculMidaTotalParceles() {
        Iterator<Allotjament> it = allotjaments.iterator();
        Allotjament espai;
        if (espai instanceof  Parcela){
            Parcela parcela = (Parcela) espai;
        }
        return 0;
    }


    @Override
    public int calculAllotjamentsOperatius() {
        return 0;
    }


    @Override
    public Allotjament getAllotjamentEstadaMesCurta() {
        return null;
    }


    public Allotjament buscarAllotjament(String id_){
        for (Allotjament allotjament : allotjaments) {
            if (Objects.equals(allotjament.getId(), id_)){
                return allotjament;
            }
        }
        return null;
    }


    public Client buscarClient(String dni_){
        for (Client client : clients) {
            if (client.getDni() == dni_){
                return client;
            }
        }
        return null;
    }
}


