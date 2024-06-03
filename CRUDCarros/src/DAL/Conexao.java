package DAL;
import java.sql.*;
public class Conexao
{
    public String stringConexao = "jdbc:mysql://localhost:3306/exercicios";
    private Connection con;
    public String mensagem;
    
    public Connection conectar()
    {
        this.mensagem = "";
        try
        {
            if(con == null || con.isClosed())
            {
                con = DriverManager.getConnection(stringConexao, "root", "");
            }
        } catch (Exception e)
        {
            this.mensagem = "Erro de conexão BD" + e.getMessage();
        }
        return con;
    }
    
    public void desconectar()
    {
        try
        {
            if(con != null && !con.isClosed())
            {
                con.close();
            }
        } catch (Exception e)
        {
            this.mensagem = "Erro ao fechar BD" + e.getMessage();
        }
    }
}
