package ventilateur;

public class Ventilateur {

    private int vitesse = 0;
    private Etat et;
    
    public Ventilateur() {
        // TODO Auto-generated constructor stub
         
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void setEt(Etat et) {
        this.et = et;
    }
    
    public void service() {
        this.et.handle();
    }

}
