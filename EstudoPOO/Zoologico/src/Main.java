public class Main {
    public static void main(String[] args) {
        Animal[] jaula = new Animal[10];
        jaula[0]= new Lobo();
        jaula[1]= new Coruja();
        jaula[2]= new Coruja();
        jaula[3]= new Leao();
        jaula[4]= new Lobo();
        jaula[5]= new Lobo();
        jaula[6]= new Leao();
        jaula[7]= new Coruja();
        jaula[8]= new Lobo();
        jaula[9]= new Coruja();

        for (Animal animal : jaula) {
            animal.emitirSom();
            if (animal instanceof Leao){
                ((Leao)animal).correr();
            } else if (animal instanceof Lobo) {
                ((Lobo)animal).correr();
            }
        }
    }
}