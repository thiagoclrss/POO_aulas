public class Bolsista extends Aluno{
    
    //atributos
    private int bolsa;
    
    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    public void renovarBolsa(){
        System.out.println("Renovando bolda de " + this.getName());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getName() + " é bolsista, pagamento facilitado. ");
    }
}
