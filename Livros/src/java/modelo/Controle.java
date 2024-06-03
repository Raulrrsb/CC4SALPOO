/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import DAL.LivroDAO;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Controle {
    public String mensagem;
    
    public void cadastrarLivro(List<String> listaDadosLivro)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarLivro(listaDadosLivro);
        if(validacao.mensagem.equals(""))
        {
            Livro livro = new Livro();
            livro.setTitulo(listaDadosLivro.get(0));
            livro.setAutor(listaDadosLivro.get(1));
            livro.setPagina(listaDadosLivro.get(2));
            LivroDAO livroDAO = new LivroDAO();
            livroDAO.cadastrarLivro(livro);
            this.mensagem = livroDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
