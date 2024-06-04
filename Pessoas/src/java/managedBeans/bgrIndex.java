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

    private String nome;
    private String rg;
    private String cpf;
    private String resposta;
    
    public String cadastrarPessoa()
    {
        List<String> listaDadosPessoa = new ArrayList<String>();
        listaDadosPessoa.add(nome);
        listaDadosPessoa.add(rg);
        listaDadosPessoa.add(cpf);
        Controle controle = new Controle();
        controle.cadastrarPessoa(listaDadosPessoa);
        this.resposta = controle.mensagem;
        return "/pagResposta";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
    public bgrIndex() {
    }
    
}
