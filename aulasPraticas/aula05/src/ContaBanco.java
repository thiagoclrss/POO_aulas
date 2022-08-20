public class ContaBanco {
    //float v;
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t){
        setTipo(t);
        this.status = true;
        //tbm pode ser feito assim => this.setStatus(true); *se eu digitar ifelse e apertar enter o código já é montado 
        if(t == "CC"){
            //this.saldo = 50;
            this.setSaldo(50);
        }else if (t == "CP"){
            //this.saldo = 150;
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        
        if(this.getSaldo() > 0){
            System.out.println("Conta n pode ser fechada pq tem dinheiro");
        } else if(this.saldo < 0){
            System.out.println("Conta em débito");
        }else{
            setStatus(false);
            //this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }        
    }

    public void depositar(float s){

        if(this.status == true){
            //this.saldo = this.saldo + s;
            this.setSaldo(this.getSaldo() + s);
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Impossível depositar em uma conta fechada!");
        }

    }

    public void sacar(float s){

        if(this.status == true){
             if(this.getSaldo() >= s){this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado!");
            }else{
                System.out.println("Saldo é insuficiente");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada!");
        }

    }

    public void pagarMensal(){
       int v = 0;
        
       if(this.getTipo() == "CC"){
           v = 12;
       } else if(this.getTipo() == "CP") {
           v = 20;
       }
       
       
        if(this.status == true){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        }else{
            System.out.println("Impossível pagar uma conta fechada.");
        }

    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean s){
        this.status = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getTipo(){
        return this.tipo;
    }
     
    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return this.numConta;
    }
    
}

