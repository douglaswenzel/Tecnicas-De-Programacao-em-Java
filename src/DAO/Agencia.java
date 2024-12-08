package DAO;

public class Agencia {
    final String tableName = "AGENCIAS";
    private int numAge;
    private String nomeAge;
    private String endeAge;
    private String numeAge;
    private String complAge;
    private String bairAge;
    private String cidaAge;
    private String ufAge;
    private String cepAge;
    private String foneAge;

    public Agencia() {
    }
    
    public String getTableName() {
        return tableName;
    }
    public String dadosSQLValues() {
        return "'" 
            + this.numAge + "', '"
            + this.nomeAge + "', '"
            + this.endeAge + "', '"
            + this.numeAge + "', '"
            + this.complAge + "', '"
            + this.bairAge + "', '"
            + this.cidaAge + "', '"
            + this.ufAge + "', '"
            + this.cepAge + "', '"
            + this.foneAge + "'";
    }

    public Agencia(int numAge, String nomeAge, String endeAge, String numeAge, 
                   String complAge, String bairAge, String cidaAge, 
                   String ufAge, String cepAge, String foneAge) {
        this.numAge = numAge;
        this.nomeAge = nomeAge;
        this.endeAge = endeAge;
        this.numeAge = numeAge;
        this.complAge = complAge;
        this.bairAge = bairAge;
        this.cidaAge = cidaAge;
        this.ufAge = ufAge;
        this.cepAge = cepAge;
        this.foneAge = foneAge;
    }

    // Validação para numAge (deve ser positivo e no intervalo válido)
    public int getNumAge() { return numAge; }
    public void setNumAge(int numAge) {
        if (numAge <= 0 || String.valueOf(numAge).length() > 5) {
            throw new IllegalArgumentException("O número da agência deve ser positivo e conter até 5 dígitos.");
        }
        this.numAge = numAge;
    }

    // Validação para nomeAge (não pode ser nulo ou vazio, e deve ter até 30 caracteres)
    public String getNomeAge() { return nomeAge; }
    public void setNomeAge(String nomeAge) {
        if (nomeAge == null || nomeAge.trim().isEmpty() || nomeAge.length() > 30) {
            throw new IllegalArgumentException("O nome da agência não pode ser vazio e deve ter até 30 caracteres.");
        }
        this.nomeAge = nomeAge.trim();
    }

    public String getEndeAge() { return endeAge; }
    public void setEndeAge(String endeAge) {
        if (endeAge == null || endeAge.trim().isEmpty() || endeAge.length() > 50) {
            throw new IllegalArgumentException("O endereço da agência não pode ser vazio e deve ter até 50 caracteres.");
        }
        this.endeAge = endeAge.trim();
    }

    public String getNumeAge() { return numeAge; }
    public void setNumeAge(String numeAge) {
        if (numeAge != null && numeAge.length() > 8) {
            throw new IllegalArgumentException("O número deve ter até 8 caracteres.");
        }
        this.numeAge = numeAge != null ? numeAge.trim() : null;
    }

    public String getComplAge() { return complAge; }
    public void setComplAge(String complAge) {
        if (complAge != null && complAge.length() > 20) {
            throw new IllegalArgumentException("O complemento deve ter até 20 caracteres.");
        }
        this.complAge = complAge != null ? complAge.trim() : null;
    }

    public String getBairAge() { return bairAge; }
    public void setBairAge(String bairAge) {
        if (bairAge != null && bairAge.length() > 20) {
            throw new IllegalArgumentException("O bairro deve ter até 20 caracteres.");
        }
        this.bairAge = bairAge != null ? bairAge.trim() : null;
    }

    public String getCidaAge() { return cidaAge; }
    public void setCidaAge(String cidaAge) {
        if (cidaAge == null || cidaAge.trim().isEmpty() || cidaAge.length() > 30) {
            throw new IllegalArgumentException("A cidade não pode ser vazia e deve ter até 30 caracteres.");
        }
        this.cidaAge = cidaAge.trim();
    }

    public String getUfAge() { return ufAge; }
    public void setUfAge(String ufAge) {
        if (ufAge == null || ufAge.trim().length() != 2) {
            throw new IllegalArgumentException("O UF deve conter exatamente 2 caracteres.");
        }
        this.ufAge = ufAge.trim().toUpperCase();
    }

    public String getCepAge() { return cepAge; }
    public void setCepAge(String cepAge) {
        if (cepAge == null || cepAge.trim().length() != 8 || !cepAge.matches("\\d{8}")) {
            throw new IllegalArgumentException("O CEP deve conter exatamente 8 caracteres numéricos.");
        }
        this.cepAge = cepAge.trim();
    }

    public String getFoneAge() { return foneAge; }
    public void setFoneAge(String foneAge) {
        if (foneAge != null && foneAge.length() > 13) {
            throw new IllegalArgumentException("O telefone deve ter até 13 caracteres.");
        }
        this.foneAge = foneAge != null ? foneAge.trim() : null;
    }
}