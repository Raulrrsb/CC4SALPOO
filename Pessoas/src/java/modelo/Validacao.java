/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Validacao {
    public String mensagem;
    
    public void validarPessoa(List<String> listaDadosPessoa)
    {
        this.mensagem = "";
        for(String s : listaDadosPessoa)
        {
            if(s.isEmpty())
            {
                this.mensagem = "Nenhum campo pode ser avzio";
                break;
            }
        }
    }
}
