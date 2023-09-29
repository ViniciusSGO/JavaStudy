public class Main {
    public static void main(String[] args) {
        Figuras[] listaFiguras = new Figuras[150];

        for (int i = 0; i < 50; i++) {
            listaFiguras[i] = new Circulo(i,i,i);
        }
        for (int i = 0; i <50 ; i++) {
            listaFiguras[i+50] = new Retangulo(i,i,i,i);
        }
        for (int i = 0; i <50 ; i++) {
            listaFiguras[i+100] = new Triangulo(i,i,i,i,i);
        }
        double somaDasAreas = 0;
        for (Figuras figura : listaFiguras) {
            somaDasAreas += figura.area();
        }

        System.out.println("Soma das áreas: " + somaDasAreas);
    }
}