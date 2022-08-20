public class Gafanhoto extends Pessoa{
    

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);//super vem de pessoa que é a superclasse de gafanhoto, então preciso passar esses parâmetros pro construtor
        this.login = login;
        this.totAssistido = 0; 
    }

    public void viuMaisUm(){
        this.totAssistido = this.totAssistido + 1;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    
}
