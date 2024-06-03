/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import modelo.Livro;
import org.hibernate.Session;

/**
 *
 * @author Usuario
 */
public class LivroDAO {
    public String mensagem;
    Session session = Conexao.getSessionFactory().openSession();
    
    public void cadastrarLivro(Livro livro)
    {
        this.mensagem = "";
        try {
            session.beginTransaction();
            session.save(livro);
            session.getTransaction().commit();
            session.close();
            this.mensagem = "Cadastrado com sucesso";
        } catch (Exception e) {
            this.mensagem = "Erro de BD";
        }
    }
}
