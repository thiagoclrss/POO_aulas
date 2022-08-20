import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;  
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos 
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){     //if(l1.getCategoria() == l2.getCategoria()) -- é o mesmo que -- if(l1.getCategoria().equals(l2.getCategoria())
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){

        if (this.aprovada) {
            System.out.println("---Desafiado---");
            this.desafiado.apresentar();
            System.out.println("---Desafiante---");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencendor =  aleatorio.nextInt(3);// o algorítmo irá gerar três resultados aleatoriamente para o vencedor
            switch(vencendor){
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:

                    System.out.println(this.desafiado.getNome() + " ganhou o desafio.");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();    
                    break;
                case 2:

                    System.out.println(this.desafiante.getNome() + " ganhou o desafio.");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("A luta não foi aprovada.");
        }

    }

    //Métodos Especiais
    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiante(Lutador dt){
        this.desafiante = dt;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setRounds(int  rd){
        this.rounds = rd;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setAprovada(boolean ap){
        this.aprovada = ap;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }
}
