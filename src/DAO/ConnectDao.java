package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConnectDao {
    
    Connection conn;
    
    public Connection connectDB(){
        JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");
 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=DB_Sistemabancario;"
                + "encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        try {
            conn = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão"+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão"+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão"+erro.getErrorCode());
        }
        return conn;

    }
    

    public void insereRegistroJFBD(String tabela, String strDados) {
        conn = connectDB();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO dbo."+tabela+" VALUES ("+strDados+")";
            JOptionPane.showMessageDialog(null, "String de insert: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Executadas inclusão");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão "+erro.getErrorCode());
            }
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
}