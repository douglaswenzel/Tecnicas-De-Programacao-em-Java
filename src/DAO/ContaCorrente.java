package DAO;


public class ContaCorrente {
    private String tableName = "CONTACORRENTE";
    private String NUM_CC;
    private String NUM_AGE;
    private int ID_CLI;
    private int saldo;

    public ContaCorrente() {
        
    }
    public String dadosSQLValues() {
        return "'" 
           + this.NUM_CC + "', '"
           + this.NUM_AGE + "', '"
           + this.ID_CLI + "', '"
           + this.saldo + "', '";
    }
    
    public ContaCorrente(String NUM_CC, String NUM_AGE, int ID_CLI, int saldo) {
        this.NUM_CC = NUM_CC;
        this.NUM_AGE = NUM_AGE;
        this.ID_CLI = ID_CLI;
        this.saldo = saldo;
    }

    public void Sacar(int valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
    }

    public void Depositar(int valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }

    public boolean Transferir(ContaCorrente contaDestino, int valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.Depositar(valor);
            return true;
        }
        return false;
    }

    
    private boolean validaSaldo(double saldo) {
        return saldo >= 0;
    }

    private boolean validaNumConta(String NUM_CC) {
        return NUM_CC != null && NUM_CC.trim().length() > 0 && NUM_CC.length() <= 10;
    }

    private boolean validaNumAgencia(String NUM_AGE) {
        return NUM_AGE != null && NUM_AGE.trim().length() > 0 && NUM_AGE.length() <= 5;
    }

    private boolean validaIdCli(int ID_CLI) {
        return ID_CLI > 0;
    }

    public String getNumConta() {
        return NUM_CC;
    }

    public void setNumConta(String NUM_CC) {
        if (!validaNumConta(NUM_CC)) {
            throw new IllegalArgumentException("Número da conta inválido. Deve ter pelo menos 1 caractere.");
        }
        this.NUM_CC = NUM_CC;
    }

    public String getNumAgencia() {
        return NUM_AGE;
    }

    public void setNumAgencia(String NUM_AGE) {
        if (!validaNumAgencia(NUM_AGE)) {
            throw new IllegalArgumentException("Número da agência inválido.");
        }
        this.NUM_AGE = NUM_AGE;
    }

    public int getIdCli() {
        return ID_CLI;
    }

    public void setIdCli(int ID_CLI) {
        if (!validaIdCli(ID_CLI)) {
            throw new IllegalArgumentException("ID do cliente inválido.");
        }
        this.ID_CLI = ID_CLI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        if (!validaSaldo(saldo)) {
            throw new IllegalArgumentException("Saldo inválido");
        }
        this.saldo = saldo;
    }

    public String getTableName() {
        return tableName;
    }

}
