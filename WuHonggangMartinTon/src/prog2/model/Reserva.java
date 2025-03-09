package prog2.model;
import java.time.LocalDate;


public class Reserva{
    private Client client;
    private Allotjament allotjament;
    private LocalDate dataEntrada;
    private LocalDate dataSortida;


    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida){
        this.client = client;
        this.allotjament = allotjament;
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
    }


    // GETTERS I SETTERS
    public Client getClient() {return client;}
    public Allotjament getAllotjament_() {return allotjament;}
    public LocalDate getDataEntrada() {return dataEntrada;}
    public LocalDate getDataSortida() {return dataSortida;}
    public void setClient(Client client) {this.client = client;}
    public void setAllotjament_(Allotjament allotjament) {this.allotjament = allotjament;}
    public void setDataEntrada(LocalDate novaDataEntrada) {this.dataEntrada = novaDataEntrada;}
    public void setDataSortida(LocalDate novaDataSortida) {this.dataSortida = novaDataSortida;}


}
