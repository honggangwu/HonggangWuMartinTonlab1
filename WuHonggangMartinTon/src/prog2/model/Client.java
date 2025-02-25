package prog2.model;

import prog2.vista.ExcepcioReserva;

public class Client {
    private String nom;
    private String DNI;

    public Client(String nom, String DNI) {
        this.nom = nom;
        this.DNI = DNI;
    }
    public String getNom(){
        return nom;
    }
    public String getDNI(){
        return DNI;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setDNI(String DNI) throws ExcepcioReserva{
        if(DNI.length() == 9){
            this.DNI = DNI;
        }
        else{
            throw ExcepcioReserva();
        }
    }
}
