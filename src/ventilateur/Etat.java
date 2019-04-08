package ventilateur;

abstract class Etat {

    private Ventilateur van;
    
    public Etat(Ventilateur van) {
        // TODO Auto-generated constructor stub
        this.van = van;
    }
    
    public Ventilateur getVan() {
        return van;
    }

    abstract void handle();
    abstract void changeEtat();

}
