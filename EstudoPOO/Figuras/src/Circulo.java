public class Circulo extends Figuras {
    private double raio;

    public Circulo(int x,int y,double raio){
        super(x,y);
        this.raio = raio;
    }
    public double area(){
        return Math.PI * (Math.pow(raio,2));
    }

    public double getRaio() {
        return raio;
    }
}
