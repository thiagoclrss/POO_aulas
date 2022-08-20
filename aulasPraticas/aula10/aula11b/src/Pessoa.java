public abstract class Pessoa {
    
    //atributos
    private String name;
    private int idade;
    private String sexo;    
    
     //Métodos
     public void fazerAniv(){
        this.idade ++;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", name=" + name + ", sexo=" + sexo + "]";
    }
   
}
