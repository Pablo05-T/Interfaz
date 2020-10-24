package fp.punto;

/**
 *
 * @author Pablo
 */
public class Puntolmpl implements Punto{
    private double x;
     private double y;
     public Puntolmpl(double x1, double y1){
         x=1;
         y=1;
     }
     
     public double getX(){ return x; }
     
     public double getY(){ return y; }
     
     public void setX(double x1){x = x1; }
     
     public void setY(double y1){y = y1; }
     
     @Override
     public String toString(){
         String s = "("+getX()+","+getY()+")";
         return s;
     }

    @Override
    public double getDistanciaAOtroPunto(Punto p) {
        double dx = this.getX() - p.getX();
        double dy = this.getY() - p.gety();
        return Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public double gety() {
        return 0; 
    }
}
