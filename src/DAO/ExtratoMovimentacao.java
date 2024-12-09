
package DAO;

import java.util.Date;

public class ExtratoMovimentacao {
    private String tableName = "MOVIMENTACAO";
    private String NUM_CC;
    private String NUM_AGE;
    private String NUM_DOCTO;
    private Date DATA_MOV;
    private String DEBITO_CREDITO;
    private int ID_HIS;
    private String COMPL_HIS;
    private double valor;
    private double saldo;

    public ExtratoMovimentacao() {
    }
    

    public ExtratoMovimentacao(String NUM_CC, String NUM_AGE, String NUM_DOCTO, Date DATA_MOV, String DEBITO_CREDITO, int ID_HIS, String COMPL_HIS, int valor, int saldo) {
        this.NUM_CC = NUM_CC;
        this.NUM_AGE = NUM_AGE;
        this.NUM_DOCTO = NUM_DOCTO;
        this.DATA_MOV = DATA_MOV;
        this.DEBITO_CREDITO = DEBITO_CREDITO;
        this.ID_HIS = ID_HIS;
        this.COMPL_HIS = COMPL_HIS;
        this.valor = valor;
        this.saldo = saldo;
    }
    
    private boolean validaNumConta(String NUM_CC) {
        return NUM_CC != null && NUM_CC.trim().length() > 0 && NUM_CC.length() <= 10;
    }

    private boolean validaNumAgencia(String NUM_AGE) {
        return NUM_AGE != null && NUM_AGE.trim().length() > 0 && NUM_AGE.length() <= 5;
    }

    private boolean validaDocumento(String NUM_DOCTO) {
        return NUM_DOCTO != null && NUM_DOCTO.trim().length() > 0 && NUM_DOCTO.length() <= 6;
    }

    private boolean validaDataMovimento(Date DATA_MOV) {
        return DATA_MOV != null;
    }

    private boolean validaCreditoDebito(String DEBITO_CREDITO) {
        return DEBITO_CREDITO != null && (DEBITO_CREDITO.equalsIgnoreCase("C") || DEBITO_CREDITO.equalsIgnoreCase("D"));
    }

    private boolean validaId_his(int ID_HIS) {
        return ID_HIS > 0;
    }

    private boolean validaComplHist(String COMPL_HIS) {
        return COMPL_HIS == null || COMPL_HIS.length() <= 30;
    }

    private boolean validaValor(int valor) {
        return valor >= 0;
    }

    private boolean validaSaldo(int saldo) {
        return saldo >= 0;
    }

    public String getNumConta() {
        return NUM_CC;
    }

    public void setNumConta(String NUM_CC) {
        if (!validaNumConta(NUM_CC)) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
        this.NUM_CC = NUM_CC;
    }

    public String getNumAgencia() {
        return NUM_AGE;
    }

    public void setNumAgencia(String NUM_AGE) {
        if (!validaNumAgencia(NUM_AGE)) {
            throw new IllegalArgumentException("Número da agência inválido");
        }
        this.NUM_AGE = NUM_AGE;
    }

    public String getDocumento() {
        return NUM_DOCTO;
    }

    public void setDocumento(String NUM_DOCTO) {
        if (!validaDocumento(NUM_DOCTO)) {
            throw new IllegalArgumentException("Documento inválido");
        }
        this.NUM_DOCTO = NUM_DOCTO;
    }

    public Date getDataMovimento() {
        return DATA_MOV;
    }

    public void setDataMovimento(Date DATA_MOV) {
        if (!validaDataMovimento(DATA_MOV)) {
            throw new IllegalArgumentException("Data de movimento inválida");
        }
        this.DATA_MOV = DATA_MOV;
    }

    public String getCreditoDebito() {
        return DEBITO_CREDITO;
    }

    public void setCreditoDebito(String DEBITO_CREDITO) {
        if (!validaCreditoDebito(DEBITO_CREDITO)) {
            throw new IllegalArgumentException("Crédito/Débito inválido");
        }
        this.DEBITO_CREDITO = DEBITO_CREDITO;
    }

    public int getId_his() {
        return ID_HIS;
    }

    public void setId_his(int ID_HIS) {
        if (!validaId_his(ID_HIS)) {
            throw new IllegalArgumentException("ID histórico inválido");
        }
        this.ID_HIS = ID_HIS;
    }

    public String getComplHist() {
        return COMPL_HIS;
    }

    public void setComplHist(String COMPL_HIS) {
        if (!validaComplHist(COMPL_HIS)) {
            throw new IllegalArgumentException("Complemento histórico inválido");
        }
        this.COMPL_HIS = COMPL_HIS;
    }

    public int getValor() {
        return (int) valor;
    }

    public void setValor(int valor) {
        if (!validaValor(valor)) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.valor = valor;
    }

    public int getSaldo() {
        return (int) saldo;
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
