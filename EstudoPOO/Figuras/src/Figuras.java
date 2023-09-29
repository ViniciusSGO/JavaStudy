public abstract class Figuras {
    private int x;
    private int y;
    public static int contador = 0;
    public Figuras(int x,int y){
        this.x = x;
        this.y = y;
    }

    public abstract double area();
}
