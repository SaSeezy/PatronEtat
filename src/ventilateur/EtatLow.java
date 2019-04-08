package ventilateur;

public class EtatLow extends Etat {

    public EtatLow(Ventilateur van) {
        // TODO Auto-generated constructor stub
        super(van);
    }

    @Override
    void handle() {
        // TODO Auto-generated method stub
        super.getVan().setVitesse(30);
        this.changeEtat();
        
        
    }

    @Override
    void changeEtat() {
        // TODO Auto-generated method stub
        System.out.println("etat Low");
        super.getVan().setEt(new EtatHigh(getVan()));
        
        
    }

}
