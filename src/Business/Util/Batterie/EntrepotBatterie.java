/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util.Batterie;

import java.util.LinkedList;

/**
 *
 * @author alexandre
 */
public class EntrepotBatterie {
     private int typeBatterie;
     private int nbBatterieType;
     private LinkedList<Batterie> lesBatteries;
     
     public EntrepotBatterie (int nbBatterie, int typeBatterie){
         this.typeBatterie = typeBatterie;
         this.lesBatteries = new LinkedList<>();
         for (int i = 0; i < nbBatterie;i++) {
             this.lesBatteries.add(new Batterie(typeBatterie,0));
         }
     }
     
     public Batterie getBatterie() throws  Exception{
         if (nbBatterieType<=0){
             throw new Exception("Trop de batterie ");
         }else{
             Batterie laBatterie  =lesBatteries.get(lesBatteries.size()-1);
             lesBatteries.remove(lesBatteries.size()-1);
             return laBatterie;
         }
     }
    
}
