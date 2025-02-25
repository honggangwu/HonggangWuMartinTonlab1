package prog2.model;

import prog2.vista.ExcepcioReserva;

public class Client {
    private String nom;
    private String DNI;

    public Client(String nom, String DNI) {
        this.nom = nom;
        this.DNI = DNI;
    }

    String getNom() {
        return nom;
    }
    void setNom(String nom) {
        this.nom = nom;
    }
    String getDNI() {
        return DNI;
    }
    void setDNI(String DNi)throws ExcepcioReserva {
        if (DNI.length()==9){
            this.DNI = DNI;
        }
        else {
            throw ExcepcioReserva();
        }

    }
}
