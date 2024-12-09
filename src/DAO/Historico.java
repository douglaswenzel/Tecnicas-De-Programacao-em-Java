/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Douglas Wenzel
 */
public class Historico {
    private String tableName = "Historicos";
    private int ID_HIS;
    private String DES_HIS;

    public Historico() {
        
    }

    public Historico(int id_his, String historico) {
        this.ID_HIS = ID_HIS;
        this.DES_HIS = DES_HIS;
    }

    private boolean validaId_his(int id_his) {
        return id_his > 0;
    }

    private boolean validaHistorico(String DES_HIS) {
        return DES_HIS != null && DES_HIS.trim().length() > 0;
    }

    public int getId_his() {
        return ID_HIS;
    }

    public void setId_his(int id_his) {
        if (!validaId_his(id_his)) {
            throw new IllegalArgumentException("ID histórico inválido");
        }
        this.ID_HIS = ID_HIS;
    }

    public String getHistorico() {
        return DES_HIS;
    }

    public void setHistorico(String DES_HIS) {
        if (!validaHistorico(DES_HIS)) {
            throw new IllegalArgumentException("Histórico inválido");
        }
        this.DES_HIS = DES_HIS;
    }
    
    public String getTableName() {
        return tableName;
    }

}
