/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import DAL.PessoaDAO;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Controle {
    public String mensagem;
    
    public void cadastrarPessoa(List<String> listaDadosPessoa)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarPessoa(listaDadosPessoa);
        if(validacao.mensagem.equals(""))
        {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(listaDadosPessoa.get(0));
            pessoa.setRg(listaDadosPessoa.get(1));
            pessoa.setCpf(listaDadosPessoa.get(2));
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.cadastrarPessoa(pessoa);
            this.mensagem = pessoaDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
