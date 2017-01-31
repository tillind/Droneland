package Business.Factory;

import Business.Drone.DroneTerrestre;
import Business.Drone.DroneVolant;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexandre on 18/01/2017.
 */
public class Parc {
    
    private static Parc leParc = null;
    
    private List<DroneTerrestre> lesDronesTerrestre;
    private List<DroneVolant> lesDroneVolant;

    private Parc(){
        this.lesDronesTerrestre = new LinkedList<>();
        this.lesDroneVolant = new LinkedList<>();
    }

    public static Parc  getParc(){
        if(leParc == null){
            leParc = new Parc();
        }
        return leParc;
    }
    
    public void ajoutDrone(DroneTerrestre monDrone){
        this.lesDronesTerrestre.add(monDrone);
    }
    public void ajoutDrone(DroneVolant monDrone){
        this.lesDroneVolant.add(monDrone);
    }


}
