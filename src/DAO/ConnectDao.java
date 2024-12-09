package DAO;

import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectDao {

    Connection conn;
    // Configurações do banco de dados (pegue os valores diretamente do phpMyAdmin)
    private static final String URL = "jdbc:mysql://162.241.2.230:3306/dougl947_sistema_bancario";
    private static final String USUARIO = "dougl947_userdb";
    private static final String SENHA = " ";
    private static final Logger LOGGER = Logger.getLogger(ConnectDao.class.getName());
    private String NUM_CC;
    private String NUM_AGE;
    private int ID_CLI;
    private double SALDO;

    // Método para estabelecer conexão com o MySQL
    public Connection connectDB() {
        JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");
 
        String caminho = "jdbc:mysql://162.241.2.230:3306/dougl947_sistema_bancario"; 
        String usuario = "dougl947_userdb";
        String senha = " ";
        try {
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
        }
        return conn;
        // conn.close();
    }
    public void insereRegistroJFBD(String tabela, String strDados) {
        conn = connectDB();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO "+tabela+" (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE,"
                   + "UF_AGE, CEP_AGE, FONE_AGE) VALUES ("+strDados+")";
            JOptionPane.showMessageDialog(null, "String de insert: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            conn.close();
        } catch (SQLException erro) {
            Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, erro);
        }
    }
    
    
    
    public void cadastrarUsuario(String tabela, int id, String senha, String numAge, String numCc) {
    Connection conn = connectDB(); // Conecta ao banco de dados
    Statement stmt;
    try {
        stmt = conn.createStatement();

        // Monta a string de inserção
        String sql = "INSERT INTO " + tabela +
                     " (ID, SENHA, NUM_AGE, NUM_CC) VALUES (" +
                     id + ", '" + senha + "', '" + numAge + "', '" + numCc + "')";
        
        JOptionPane.showMessageDialog(null, "String de insert: " + sql); // Para depuração

        try {
            // Executa a instrução SQL
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: " + erro.getMessage());
        }

        conn.close();
    } catch (SQLException erro) {
        Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, erro);
    }
}
    
    public void cadastrarMovimentacao(String tabela, String numCc, String numAge, String numDocto, Date dataMov, String debitoCredito, int idHis, String complHis, double valor, double saldo) {
    Connection conn = connectDB(); // Conecta ao banco de dados
    Statement stmt;
    try {
        stmt = conn.createStatement();

        // Monta a string de inserção
        String sql = "INSERT INTO " + tabela +
                     " (NUM_CC, NUM_AGE, NUM_DOCTO, DATA_MOV, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO) VALUES (" +
                     "'" + numCc + "', '" + numAge + "', '" + numDocto + "', '" + new java.sql.Date(dataMov.getTime()) + "', '" + debitoCredito + "', " + idHis + ", '" + complHis + "', " + valor + ", " + saldo + ")";
        
        JOptionPane.showMessageDialog(null, "String de insert: " + sql); // Para depuração

        try {
            // Executa a instrução SQL
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Movimentação cadastrada com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar movimentação: " + erro.getMessage());
        }

        conn.close();
    } catch (SQLException erro) {
        Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, erro);
    }
}


    
    public void cadastrarAgencia(String tabela, String strDados) {
    Connection conn = connectDB(); // Conecta ao banco de dados
    Statement stmt;
    try {
        stmt = conn.createStatement();

        // String de inserção SQL com placeholders para os dados
        String sql = "INSERT INTO " + tabela + 
                     " (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) " +
                     "VALUES (" + strDados + ")";
        
        // Exibe a string de inserção para depuração
        JOptionPane.showMessageDialog(null, "String de insert: " + sql);

        try {
            // Executa a instrução SQL
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
        } catch (SQLException erro) {
            // Trata erros de SQL
            JOptionPane.showMessageDialog(null, "Erro de conexão, ConnectDao - Mensagem => " + erro.getMessage());
            JOptionPane.showMessageDialog(null, "\nErro de conexão, ConnectDao - Estado => " + erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\nErro de conexão, ConnectDao - Código => " + erro.getErrorCode());
        }

        // Fecha a conexão com o banco
        conn.close();
    } catch (SQLException erro) {
        Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, erro);
    }
    }
    
    
    public void cadastrarHis(String tabela, int idHis, String desHis) {
    Connection conn = connectDB(); // Conecta ao banco de dados
    Statement stmt;
    try {
        stmt = conn.createStatement();

        // Monta a string de inserção
        String sql = "INSERT INTO " + tabela +
                     " (ID_HIS, DES_HIS) VALUES (" + idHis + ", '" + desHis + "')";
        
        JOptionPane.showMessageDialog(null, "String de insert: " + sql); // Para depuração

        try {
            // Executa a instrução SQL
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Histórico cadastrado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar histórico: " + erro.getMessage());
        }

        conn.close();
    } catch (SQLException erro) {
        Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, erro);
    }
    }

    
    public void cadastrarCC(String tabela, String numCC, String numAge, int idCli, double saldo) {
    if (numCC == null || numCC.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "O número da conta corrente (NUM_CC) não pode estar vazio.");
        return;
    }
    

    String strDados = "'" + numCC + "', '" + numAge + "', " + idCli + ", " + saldo;

    Connection conn = connectDB(); // Conecta ao banco de dados
    Statement stmt;
    try {
        stmt = conn.createStatement();

        String sql = "INSERT INTO " + tabela +
                     " (NUM_CC, NUM_AGE, ID_CLI, SALDO) " +
                     "VALUES (" + strDados + ")";

        JOptionPane.showMessageDialog(null, "String de insert: " + sql);

        try {
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Conta-corrente cadastrada com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, ConnectDao - Mensagem => " + erro.getMessage());
        }

        conn.close();
    } catch (SQLException erro) {
        Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, erro);
    }
}
    
    public void cadastrarCliente(String tabela, String strDados) {
    Connection conn = connectDB(); // Conecta ao banco de dados
    Statement stmt;
    try {
        stmt = conn.createStatement();

        // String de inserção SQL com os dados formatados
        String sql = "INSERT INTO " + tabela + 
                     " (ID_CLI, NOME_CLI, END_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, ) " +
                     "VALUES (" + strDados + ")";
        
        // Exibe a string de inserção para depuração
        JOptionPane.showMessageDialog(null, "String de insert: " + sql);

        try {
            // Executa a instrução SQL
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } catch (SQLException erro) {
            // Trata erros de SQL
            JOptionPane.showMessageDialog(null, "Erro de conexão, ConnectDao - Mensagem => " + erro.getMessage());
            JOptionPane.showMessageDialog(null, "\nErro de conexão, ConnectDao - Estado => " + erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\nErro de conexão, ConnectDao - Código => " + erro.getErrorCode());
        }

        // Fecha a conexão com o banco
        conn.close();
    } catch (SQLException erro) {
        Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, erro);
    }
    }

    

    public void alteraRegistroJFBD(String tabela, String strDados, String condicao) {
        conn = connectDB();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            
            String sql = "UPDATE dbo."+tabela+" SET "+strDados+" WHERE "+condicao;
            JOptionPane.showMessageDialog(null, "String de update: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Alteração executada com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            conn.close();
        } catch (SQLException erro) {
            Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    public void excluiRegistroJFBD(String tabela, String condicao) {
        conn = connectDB();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            
            String sql = "DELETE FROM dbo."+tabela+" WHERE "+condicao;
            JOptionPane.showMessageDialog(null, "String de delete: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Exclusão executada com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            conn.close();
        } catch (SQLException erro) {
            Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    public List<String> consultaRegistroJFBD(String tabela, String campos, String condicao) {
        conn = connectDB();
        Statement stmt;
        ResultSet rs;
        List<String> lista = new ArrayList<>();
        try {
            stmt = conn.createStatement();
            
            String sql = "SELECT "+campos+" FROM dbo."+tabela+" WHERE "+condicao;
            JOptionPane.showMessageDialog(null, "String de select: "+sql);
            
            try {
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    lista.add(rs.getString(1));
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            conn.close();
        } catch (SQLException erro) {
            Logger.getLogger(ConnectDao.class.getName()).log(Level.SEVERE, null, erro);
        }
        return lista;
    }
    
        public static void inserirAgencia(int numAge, String nomeAge, String endeAge, String numeAge,
                                      String complAge, String bairAge, String cidaAge, 
                                      String ufAge, String cepAge, String foneAge) {
        String sql = "INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, CEP_AGE, UF_AGE, ENDE_AGE, NUME_AGE, BAIR_AGE, COMPL_AGE,"
                + "CIDA_AGE, FONE_AGE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Configurando os valores para os parâmetros
            preparedStatement.setInt(1, numAge);
            preparedStatement.setString(2, nomeAge);
            preparedStatement.setString(3, endeAge);
            preparedStatement.setString(4, numeAge);
            preparedStatement.setString(5, complAge);
            preparedStatement.setString(6, bairAge);
            preparedStatement.setString(7, cidaAge);
            preparedStatement.setString(8, ufAge);
            preparedStatement.setString(9, cepAge);
            preparedStatement.setString(10, foneAge);

            // Executando o comando SQL
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Agência inserida com sucesso!");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao inserir agência: " + e.getMessage());
        }
    }
    
    
    
}

  
