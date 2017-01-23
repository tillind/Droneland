package Business;

import Business.Drone.DroneTerrestre;
import Business.Drone.DroneVolant;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexandre on 18/01/2017.
 */
public class Parc {
    private List<DroneTerrestre> lesDronesTerrestre;
    private List<DroneVolant> lesDroneVolant;

    public Parc(){
        this.lesDronesTerrestre = new LinkedList<>();
        this.lesDroneVolant = new LinkedList<>();
    }

    public void ajoutDrone(DroneTerrestre monDrone){
        this.lesDronesTerrestre.add(monDrone);
    }
    public void ajoutDrone(DroneVolant monDrone){
        this.lesDroneVolant.add(monDrone);
    }


}
