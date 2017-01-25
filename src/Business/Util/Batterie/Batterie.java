package Business.Util.Batterie;

/**
 * Created by alexandre on 18/01/2017.
 */
public class Batterie {
    private int autonomie;
    private int seuilSuffisance;
    private int capacite;

    public Batterie(int seuilSuffisance, int capacite){
        this.setAutonomie(100);
        this.setSeuilSuffisance(seuilSuffisance);
        this.setCapacite(capacite);
    }

    public int getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }

    public int getSeuilSuffisance() {
        return seuilSuffisance;
    }

    public void setSeuilSuffisance(int seuilSuffisance) {
        this.seuilSuffisance = seuilSuffisance;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }


    public int Recharger(){
        int tmpAutnomie = this.autonomie;
        for(int i = this.autonomie ; this.autonomie <101;i++){
            this.autonomie++;
        }
        return this.getAutonomie();
    }
}
