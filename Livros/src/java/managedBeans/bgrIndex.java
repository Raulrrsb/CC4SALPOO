/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Controle;

/**
 *
 * @author Usuario
 */
@ManagedBean
@RequestScoped
public class bgrIndex {

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    private String autor;
    private String pagina;
    private String resposta;
    
    public String cadastrarLivro()
    {
        List<String> listaDadosLivro = new ArrayList<String>();
        listaDadosLivro.add(titulo);
        listaDadosLivro.add(autor);
        listaDadosLivro.add(pagina);
        Controle controle = new Controle();
        controle.cadastrarLivro(listaDadosLivro);
        this.resposta = controle.mensagem;
        return "/pagResposta";
    }
    public bgrIndex() {
    }
    
}
