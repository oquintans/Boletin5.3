


package ejercicio3;
public class Circulo {
    private double radio;
    private double PI = 3.14;
    
    public Circulo () {
        
    }
    
    public Circulo (double r, double p) {
        radio = r;
        PI = p;        
    }
    
    public double getRadio (){
        return radio;
    }
    public void setRadio (float r) {
        radio=r;
    }
    public double calcularArea (){
       double area = (Math.pow(radio,2))*PI;
       return area;   
    }
    public double calcularLongitud () {
        double longitud = 2*radio*PI;
        return longitud;
    }
}
