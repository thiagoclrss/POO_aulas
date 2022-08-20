public class Pessoa {
    //atributos 
    private String nome;
    private int idade;
    private String sexo;
    
    //métodos especiais
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void setNome(String no){
        this.nome = no;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setSexo(String se){
        this.sexo = se;
    }
    public String getSexo(){
        return this.sexo;
    }

    //métodos
    public void fazerAniver(){
        //this.setIdade(this.getIdade() + 1);
        this.idade++;
    }
}   
