public class App {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80; // em um atributo private, eu consigo utilizar pq estou dentro de uma classe "class App" que utiliza a classe Caneta.
        //c1.tampada = true;        
        c1.destampar();
        c1.status();       
    }
    //dentro do main eu posso fazer uso dos métodos e atributos que são públicos e protegidos mas n dos privados.
    //um atributo private como "tampar" n me da acesso pelo main, porem como o metodo destampar faz parte da classe Caneta, eu posso chamar esse metodo e ele terá acesso ao atributo privado pois faz parte da mesma classe 
}
