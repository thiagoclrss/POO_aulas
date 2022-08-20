public class Livro implements Publicacao{
    
    //atributos
    private String titulo;
    private String autor;
    private int totpag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //métodos especiais 
    public Livro(String titulo, String autor, int totpag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpag = totpag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotpag() {
        return totpag;
    }

    public void setTotpag(int totpag) {
        this.totpag = totpag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //métodos
    //@Override
    public String detalhes() {
        return "Livro [aberto=" + aberto + "\n, autor=" + autor + "\n, leitor=" + leitor.getNome() + "\n, pagAtual=" + pagAtual
                + "\n, titulo=" + titulo + "\n, totpag=" + totpag + "]";
    }

    //métodos da interface publicacao 
    @Override
    public void abrir() {
        this.aberto = true;
        
    }

    @Override
    public void fechar() {
        this.aberto = false;
        
    }

    @Override
    public void folhear(int p) {
       if(p > this.pagAtual) {
           this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
        
    }

    @Override
    public void avançarPag() {
        this.pagAtual++;
        
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
        
    }

}
