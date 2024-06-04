/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import modelo.Pessoa;
import org.hibernate.Session;

/**
 *
 * @author Usuario
 */
public class PessoaDAO {

    public String mensagem;
    Session session = Conexao.getSessionFactory().openSession();

    public void cadastrarPessoa(Pessoa pessoa) {
        this.mensagem = "";
        try {
            
            session.beginTransaction();
            session.save(pessoa);
            session.getTransaction().commit();
            session.close();
            this.mensagem = "Cadastrado";

        } catch (Exception e) {
            this.mensagem = "Erro";
        }

    }
}
