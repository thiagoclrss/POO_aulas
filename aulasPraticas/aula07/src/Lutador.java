public class Lutador {
    
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){

        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe); 
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;

    }

    public void setNome (String no){
        this.nome = no;
    }

    public String getNome (){
        return this.nome;
    }

    public void setNacionalidade (String na){
        this.nacionalidade = na;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setIdade(int id){
        this.idade = id;
    }

    public int getIdade (){
        return this.idade;
    }

    public void setAltura (float al){
        this.altura = al;
    }

    public float getAltura (){
        return this.altura;
    }

    public void setPeso(float pe){
        this.peso = pe;
        setCategoria();
    }

    public float getPeso (){
        return this.peso;
    }
    
    private void setCategoria(){
        //this.categoria = ca;
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public String getCategoria (){
        return this.categoria;
    }

    public void setVitorias (int vi){
        this.vitorias = vi;
    }

    public int getVitorias (){
        return this.vitorias;
    }

    public void setDerrotas (int de){
        this.derrotas = de;
    }

    public int getDerrotas (){
        return this.derrotas;
    }

    public void setEmpates (int em){
        this.vitorias = em;
    }

    public int getEmpates (){
        return this.empates;
    }
    
    //Métodos Públicos
    public void apresentar(){
        System.out.println("------------------------------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias() + " lutas");
        System.out.println("Perdeu: " + getDerrotas() + " lutas");
        System.out.println("Empatou: " + getEmpates() + " lutas");
    }

    public void status(){
        System.out.println("------------------------------------");
        System.out.println(getNome());
        System.out.println("É um peso "+ getCategoria());
        System.out.println(getVitorias() + " vitórias"); 
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");   
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
}
