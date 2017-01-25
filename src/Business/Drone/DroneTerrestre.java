package Business.Drone;

import Business.Util.Batterie.Batterie;
import Business.Util.Position;

/**
 * Created by alexandre on 18/01/2017.
 */
public abstract class DroneTerrestre extends Drone {
    
    public DroneTerrestre(int distance, int vitesseMax, int chargeMax, Batterie laBatterie, Position laPosition) {
        super(distance, vitesseMax, chargeMax, laBatterie, laPosition);
    }
    
    
 
}
