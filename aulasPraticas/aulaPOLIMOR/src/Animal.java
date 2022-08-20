public abstract class Animal {
    
    //atributos
    protected Float peso;
    protected int idade;
    protected int membros;
    
    //métodos especiais
    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }

    //métodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

}
