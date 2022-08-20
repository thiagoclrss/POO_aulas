public class App {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r =  new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara a2 = new Arara();

        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
    }
}
