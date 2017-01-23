package Business.Util;

/**
 * Created by alexandre on 18/01/2017.
 */
public class Colis {
    private int numero;
    private int poid;
    private Position destinataire;

    public Colis(int numero,int poid,Position destinataire){
        this.setNumero(numero);
        this.setPoid(poid);
        this.setDestinataire(destinataire);
    }

    public Position getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(Position destinataire) {
        this.destinataire = destinataire;
    }

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
