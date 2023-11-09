
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dsm2
 */
public class Cadastro_Login {
    
    private int codigo;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    
    Conexao con = new Conexao();

    public Cadastro_Login() {
        this(0,"","","","");
    }

    public Cadastro_Login(int codigo, String nome, String sobrenome, String email, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
     public void cadastrarUsuario(){           
      String sql= "INSERT INTO Sign_In_Up(Nome,Sobrenome,Email,Senha)values "+
                "('"+ this.getNome()+"','"+this.getSobrenome()+"','"+this.getEmail()+"','"+ this.getSenha()+"' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");     
    }
     
    public ResultSet logar_Usuario(String email,String senha){
        ResultSet tabela;
        tabela = null;
        
         String sql= "SELECT * FROM Sign_In_Up WHERE Email='" + email + "'and Senha='" + senha + "'";
          tabela= con.RetornarResultset(sql);  
          return tabela;
    }    
    
   public void excluir_Usuario(){
        String sql;
        sql= "DELETE FROM Sign_In_Up WHERE CODIGO="+ getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso...");
    }
   
  public ResultSet consultar_Usuario(){
        ResultSet tabela;
        tabela = null;
        
        String sql= "SELECT * FROM Sign_In_Up WHERE email ='" + this.getEmail() + "'";
        tabela = con.RetornarResultset(sql);
     return tabela;   
    }
  
  public void alterar_Usuario(){
        String sql;
        sql="UPDATE Sign_In_Up SET Nome='"+ this.getNome()+"',Sobrenome='"+this.getSobrenome()+"',Email='"+this.getEmail()+"',Senha='"+this.getSenha()+"' where CODIGO='"+getCodigo()+"'";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso...");
        
    }
    
}
