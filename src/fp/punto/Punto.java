package fp.punto;

/**
 *
 * @author Pablo
 */
public interface Punto {

    public void setX(double d);

    public void setY(double d);
    
    double getDistanciaAOtroPunto(Punto p);

    public double getX();

    public double gety();

    
}
