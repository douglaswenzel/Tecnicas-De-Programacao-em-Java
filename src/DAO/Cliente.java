package DAO;

import java.util.Date;


public class Cliente {
    private int ID_CLI; // decimal(9,0)
    private String NOME_CLI; // varchar(50)
    private String ENDE_CLI; // varchar(50)
    private String NUME_CLI; // varchar(8)
    private String COMPL_CLI; // varchar(20)
    private String BAIR_CLI; // varchar(20)
    private String CIDA_CLI; // varchar(30)
    private String UF_CLI; // char(2)
    private String CEP_CLI; // char(8)
    private String FONE_CLI; // varchar(13)
    private String CPF_CLI; // char(11)
    private Date DATA_NASC; // datetime
    private String CNPJ_CLI; // char(14)

    public Cliente() {
    }

  
    public Cliente(int ID_CLI, String NOME_CLI, String ENDE_CLI, String NUME_CLI, String COMPL_CLI, String BAIR_CLI, String CIDA_CLI,
                   String UF_CLI, String CEP_CLI, String FONE_CLI, String CPF_CLI, Date DATA_NASC, String CNPJ_CLI) {
        this.ID_CLI = ID_CLI;
        this.NOME_CLI = NOME_CLI;
        this.ENDE_CLI = ENDE_CLI;
        this.NUME_CLI = NUME_CLI;
        this.COMPL_CLI = COMPL_CLI;
        this.BAIR_CLI = BAIR_CLI;
        this.CIDA_CLI = CIDA_CLI;
        this.UF_CLI = UF_CLI;
        this.CEP_CLI = CEP_CLI;
        this.FONE_CLI = FONE_CLI;
        this.CPF_CLI = CPF_CLI;
        this.DATA_NASC = DATA_NASC;
        this.CNPJ_CLI = CNPJ_CLI;  
    }
        public int getIdCli() {
        return ID_CLI;
    }

    public void setIdCli(int ID_CLI) {
        if (ID_CLI <= 0) {
            throw new IllegalArgumentException("ID do cliente deve ser um valor positivo.");
        }
        this.ID_CLI = ID_CLI;
    }

    public String getNomeCli() {
        return NOME_CLI;
    }

    public void setNomeCli(String NOME_CLI) {
        if (NOME_CLI == null || NOME_CLI.trim().length() < 2 || NOME_CLI.length() > 50) {
            throw new IllegalArgumentException("Nome deve ter entre 2 e 50 caracteres.");
        }
        this.NOME_CLI = NOME_CLI;
    }

    public String getEndeCli() {
        return ENDE_CLI;
    }

    public void setEndeCli(String ENDE_CLI) {
        if (ENDE_CLI == null || ENDE_CLI.trim().length() < 5 || ENDE_CLI.length() > 50) {
            throw new IllegalArgumentException("Endereço deve ter entre 5 e 50 caracteres.");
        }
        this.ENDE_CLI = ENDE_CLI;
    }

    public String getNumeCli() {
        return NUME_CLI;
    }

    public void setNumeCli(String NUME_CLI) {
        if (NUME_CLI != null && (NUME_CLI.trim().length() == 0 || NUME_CLI.length() > 8)) {
            throw new IllegalArgumentException("Número deve ter até 8 caracteres ou ser vazio.");
        }
        this.NUME_CLI = NUME_CLI;
    }

    public String getComplCli() {
        return COMPL_CLI;
    }

    public void setComplCli(String COMPL_CLI) {
        if (COMPL_CLI != null && (COMPL_CLI.trim().length() == 0 || COMPL_CLI.length() > 20)) {
            throw new IllegalArgumentException("Complemento deve ter até 20 caracteres ou ser vazio.");
        }
        this.COMPL_CLI = COMPL_CLI;
    }

    public String getBairCli() {
        return BAIR_CLI;
    }

    public void setBairCli(String BAIR_CLI) {
        if (BAIR_CLI != null && (BAIR_CLI.trim().length() < 2 || BAIR_CLI.length() > 20)) {
            throw new IllegalArgumentException("Bairro deve ter entre 2 e 20 caracteres ou ser vazio.");
        }
        this.BAIR_CLI = BAIR_CLI;
    }

    public String getCidaCli() {
        return CIDA_CLI;
    }

    public void setCidaCli(String CIDA_CLI) {
        if (CIDA_CLI == null || CIDA_CLI.trim().length() < 2 || CIDA_CLI.length() > 30) {
            throw new IllegalArgumentException("Cidade deve ter entre 2 e 30 caracteres.");
        }
        this.CIDA_CLI = CIDA_CLI;
    }

    public String getUfCli() {
        return UF_CLI;
    }

    public void setUfCli(String UF_CLI) {
        if (UF_CLI == null || UF_CLI.trim().length() != 2) {
            throw new IllegalArgumentException("UF deve conter exatamente 2 caracteres.");
        }
        this.UF_CLI = UF_CLI;
    }

    public String getCepCli() {
        return CEP_CLI;
    }

    public void setCepCli(String CEP_CLI) {
        if (CEP_CLI == null || CEP_CLI.trim().replaceAll("[^0-9]", "").length() != 8) {
            throw new IllegalArgumentException("CEP deve conter exatamente 8 dígitos.");
        }
        this.CEP_CLI = CEP_CLI;
    }

    public String getFoneCli() {
        return FONE_CLI;
    }

    public void setFoneCli(String FONE_CLI) {
        if (FONE_CLI != null && FONE_CLI.length() > 13) {
            throw new IllegalArgumentException("Telefone deve ter até 13 caracteres ou ser vazio.");
        }
        this.FONE_CLI = FONE_CLI;
    }

    public String getCpfCli() {
        return CPF_CLI;
    }

    public void setCpfCli(String CPF_CLI) {
        if (CPF_CLI != null && CPF_CLI.trim().replaceAll("[^0-9]", "").length() != 11) {
            throw new IllegalArgumentException("CPF deve conter exatamente 11 dígitos.");
        }
        this.CPF_CLI = CPF_CLI;
    }

    public Date getDataNasc() {
        return DATA_NASC;
    }

    public void setDataNasc(Date DATA_NASC) {
        if (DATA_NASC == null) {
            throw new IllegalArgumentException("Data de nascimento não pode ser nula.");
        }
        this.DATA_NASC = DATA_NASC;
    }

    public String getCnpjCli() {
        return CNPJ_CLI;
    }

    public void setCnpjCli(String CNPJ_CLI) {
        if (CNPJ_CLI != null && CNPJ_CLI.trim().replaceAll("[^0-9]", "").length() != 14) {
            throw new IllegalArgumentException("CNPJ deve conter exatamente 14 dígitos.");
        }
        this.CNPJ_CLI = CNPJ_CLI;
    }
    
  
    
    public String dadosSQLValues() {
        return String.format(
            "'%d', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%tF', '%s'",
            this.ID_CLI,
            this.NOME_CLI,
            this.ENDE_CLI,
            this.NUME_CLI != null ? this.NUME_CLI : "",
            this.COMPL_CLI != null ? this.COMPL_CLI : "",
            this.BAIR_CLI != null ? this.BAIR_CLI : "",
            this.CIDA_CLI,
            this.UF_CLI,
            this.CEP_CLI,
            this.FONE_CLI != null ? this.FONE_CLI : "",
            this.CPF_CLI != null ? this.CPF_CLI : "",
            this.DATA_NASC,
            this.CNPJ_CLI != null ? this.CNPJ_CLI : ""
        );  
    }
}
