package ventilateur;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ventilateur van = new Ventilateur();
        van.setEt(new EtatOff(van));
        for(int i = 0; i < 8; i++) {
            van.service();
        }

    }

}
