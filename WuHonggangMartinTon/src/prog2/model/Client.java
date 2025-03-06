package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.util.EmptyStackException;

public class Client{
    private String nom;
    private String Dni;

    public Client(String nom,String Dni){
        this.nom=nom;
        this.Dni=Dni;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public String getDni(){
        return this.Dni;
    }

    public void setDni()throws ExcepcioReserva{
        if(Dni.length()==9){
            this.Dni=Dni;
        }
        else{
            throw new ExcepcioReserva("ERROR: El Dni ha de tenir 9 caracters");
        }
    }

}
