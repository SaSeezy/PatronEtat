package ventilateur;

public class EtatOn extends Etat {

    public EtatOn(Ventilateur van) {
        // TODO Auto-generated constructor stub
        super(van);
    }

    @Override
    void handle() {
        // TODO Auto-generated method stub
        super.getVan().setVitesse(20);
        this.changeEtat();
         
    }

    @Override
    void changeEtat() {
        // TODO Auto-generated method stub
        System.out.println("etat On");
        super.getVan().setEt(new EtatLow(getVan()));
        
        
    }

}
