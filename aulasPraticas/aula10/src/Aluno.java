public class Aluno extends Pessoa{
    
    //atributos
    private int matr;
    private String curso;
    
    //Métodos especiais
    public int getMatr() {
        return matr;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Métodos
    public void cancelarMatr(){
        System.out.println("Mátricula cancelada.");
    }

}
