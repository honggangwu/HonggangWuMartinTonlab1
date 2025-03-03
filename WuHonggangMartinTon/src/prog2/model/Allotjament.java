package prog2.model;

public abstract class Allotjament implements InAllotjament{
    String nom;
    String id;
    long estadaMinAlta;
    long estadaMinBaixa;

    public Allotjament(String nom, String id, int estadaMinAlta, int estadaMinBaixa) {
        this.nom = nom;
        this.id = id;
        this.estadaMinAlta = estadaMinAlta;
        this.estadaMinBaixa = estadaMinBaixa;
    }

    // GETTERS I SETTERS
    @Override
    public String getNom() {
        return this.nom;
    }
    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String getId() {
        return this.id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public long getEstadaMinima(Temp temp) {
        switch (temp) {
            case ALTA -> {return this.estadaMinAlta;}
            case BAIXA -> {return this.estadaMinBaixa;}
        }
        return 0;
    }
    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        this.estadaMinAlta = estadaMinimaALTA_;
        this.estadaMinBaixa = estadaMinimaBAIXA_;
    }

    @Override
    public boolean correcteFuncionament() {
        return false;
    }
}