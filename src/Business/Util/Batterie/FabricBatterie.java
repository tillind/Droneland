/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util.Batterie;

import Business.Util.EBatterie;

/**
 *
 * @author alexandre
 */
public class FabricBatterie {
        private static FabricBatterie laFabric = null;
        
        private EntrepotBatterie lesPetites;
        private EntrepotBatterie lesMoyennes;
        private EntrepotBatterie lesGrandes;
        
        public static FabricBatterie getLaFabric(){
                if(laFabric == null){
                    laFabric = new  FabricBatterie();
                }
                return laFabric;
        }
        
        private  FabricBatterie(){
            this.lesGrandes = new EntrepotBatterie(15, 8000);
            this.lesMoyennes = new EntrepotBatterie(30, 4000);
            this.lesPetites = new EntrepotBatterie(45, 2000);
        }
        
        public Batterie getBatterie(EBatterie eBat)
        {
            Batterie laBatterie =null;
            switch(eBat){
                case GRANDE: 
                    try {
                        laBatterie = lesGrandes.getBatterie();
                    } catch (Exception e) {
                        
                    }
                    ;break;
                case MOYENNE:
                     try {
                        laBatterie = lesMoyennes.getBatterie();
                    } catch (Exception e) {
                        
                    }
                    ;break;
                case PETITE:  
                    try {
                        laBatterie = lesPetites.getBatterie();
                    } catch (Exception e) {
                        
                    };break;
            }
            return laBatterie;
            
        }
}
