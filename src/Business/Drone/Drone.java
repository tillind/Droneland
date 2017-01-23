package Business.Drone;

import Business.Util.Batterie;
import Business.Util.Colis;
import Business.Util.EtatDrone;
import Business.Util.Position;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexandre on 18/01/2017.
 */
public abstract class Drone {

    private int distance;
    private int vitesseMax;
    private int chargeMax;
    private Batterie laBatterie;
    private List<Colis> lesColis;
    private Position laPosition;

    private EtatDrone etat;
    private Position laDestination;

    public Drone(int distance, int vitesseMax, int chargeMax,Batterie laBatterie, Position laPosition){
        lesColis = new LinkedList<>();
        this.setDistance(distance);
        this.setChargeMax(chargeMax);
        this.setVitesseMax(vitesseMax);
        this.setLaBatterie(laBatterie);
        this.setLaPosition(laPosition);
    }

    public void changeDestination(Position laPosition){
        this.laDestination=laPosition;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public int getChargeMax() {
        return chargeMax;
    }

    public void setChargeMax(int chargeMax) {
        this.chargeMax = chargeMax;
    }

    public EtatDrone getEtat() {
        return etat;
    }

    public void setEtat(EtatDrone etat) {
        this.etat = etat;
    }

    public Position getLaPosition() {
        return laPosition;
    }

    public void setLaPosition(Position laPosition) {
        this.laPosition = laPosition;
    }


    public Batterie getLaBatterie() {
        return laBatterie;
    }

    public void setLaBatterie(Batterie laBatterie) {
        this.laBatterie = laBatterie;
    }



    public void addColis(Colis obj){
        this.lesColis.add(obj);
    }
}
