package Business.Util;

/**
 * Created by alexandre on 18/01/2017.
 */
public class Position {
    private int x;
    private int y;

    public Position(int x,int y){
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Position mapos = (Position)obj;
        if(mapos.getX()==this.getX() && mapos.getY() == this.getY()){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "(Axe x: "+this.getX()+"; Axe y:"+this.getY()+")";
    }
}
