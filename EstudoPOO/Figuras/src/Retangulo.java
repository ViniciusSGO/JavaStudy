public class Retangulo extends Figuras{
    private double largura;
    private double comprimento;
    public Retangulo(int x, int y,double l,double c){
        super(x,y);
        this.comprimento = c;
        this.largura = l;
    }
    public double area(){
        return largura*comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }
}
