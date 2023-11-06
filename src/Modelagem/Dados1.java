package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dsm2
 */
public class Dados1 {
    private int Id;
    private String Nome;
    private String Proprietario;
    private String Telefone;
    private String Dt_analise;
    private String Doenca;
    private String Obs;
    
    Conexao con = new Conexao();

    public Dados1() {
        this(0,"","","","","","");
    }

    public Dados1(int Id, String Nome, String Proprietario, String Telefone, String Dt_analise, String Doenca, String Obs) {
        this.Id = Id;
        this.Nome = Nome;
        this.Proprietario = Proprietario;
        this.Telefone = Telefone;
        this.Dt_analise = Dt_analise;
        this.Doenca = Doenca;
        this.Obs = Obs;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario(String Proprietario) {
        this.Proprietario = Proprietario;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getDt_analise() {
        return Dt_analise;
    }

    public void setDt_analise(String Dt_analise) {
        this.Dt_analise = Dt_analise;
    }

    public String getDoenca() {
        return Doenca;
    }

    public void setDoenca(String Doenca) {
        this.Doenca = Doenca;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }
    
    public void cadastrarDado(){           
      String sql= "INSERT INTO Registro(Nome_plantacao,Proprietario,Telefone,Dt_analise,Doenca,Obs)values "+
                "('"+ this.getNome()+"','"+this.getProprietario()+"','"+this.getTelefone()+"','"+ this.getDt_analise()+"','"+ this.getDoenca()+"','"+ this.getObs()+"' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }

        
     public ResultSet consultarDado(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "SELECT * FROM Registro";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }
     
     public ResultSet consultarId(){
        ResultSet tabela;
        tabela = null;
    
        try{
          String sql="Select * from Registro where Proprietario like '"+ getProprietario() + "%'";
          tabela= con.RetornarResultset(sql);                  
       
           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }

     
      public void excluirDado(){
        String sql;
        sql= "DELETE FROM Registro WHERE ID="+ getId();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso...");
    }
      
      public void alterarDado(){
        String sql;
        sql="UPDATE Registro SET Nome_plantacao='"+ this.getNome()+"',Proprietario='"+this.getProprietario()+"',Telefone='"+this.getTelefone()+"',Dt_analise='"+this.getDt_analise()+"',Doenca='"+this.getDoenca()+"',Obs='"+this.getObs()+"' where Id="+getId();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso...");
        
    }

    public ResultSet consultarProprietario(String proprietario) {
         ResultSet tabela;
        tabela = null;
    
        try{
          String sql="Select * from Registro where Proprietario like '%"+ proprietario + "%'";
          tabela= con.RetornarResultset(sql);                  
          
           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }
}
