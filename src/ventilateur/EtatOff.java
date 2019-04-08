package ventilateur;

public class EtatOff extends Etat {

    public EtatOff(Ventilateur van) {
        // TODO Auto-generated constructor stub
        super(van);
    }

    @Override
    void handle() {
        // TODO Auto-generated method stub
        
        super.getVan().setVitesse(10);
        this.changeEtat();
        
    }

    @Override
    void changeEtat() {
        // TODO Auto-generated method stub
        System.out.println("etat Off");
        super.getVan().setEt(new EtatOn(getVan()));
        
        
    }

}
