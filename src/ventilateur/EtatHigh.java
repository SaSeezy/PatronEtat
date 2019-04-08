package ventilateur;

public class EtatHigh extends Etat {

    public EtatHigh(Ventilateur van) {
        // TODO Auto-generated constructor stub
        super(van);
    }

    @Override
    void handle() {
        // TODO Auto-generated method stub
        this.changeEtat();
        super.getVan().setVitesse(0);
        
        
    }

    @Override
    void changeEtat() {
        // TODO Auto-generated method stub
        System.out.println("etat High");
        
        super.getVan().setEt(new EtatOff(getVan()));
        
    }

}
