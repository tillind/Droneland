package Main;

import Business.Drone.DroneTerrestre;
import Business.Drone.RepTer;
import Business.Util.Batterie.Batterie;
import Business.Util.Position;

/**
 * Created by alexandre on 18/01/2017.
 */
public class testMethode {
     public static void main(String args[]) {
         RepTer testDrone = new RepTer(1500, 4, 0, new Batterie(0, 0), new Position(15, 40));
         
         testDrone.deplacement(new Position(5, 30));
         testDrone.deplacement(new Position(15,40));
         
         testDrone.deplacement(new Position(50, 30));
     }
}
