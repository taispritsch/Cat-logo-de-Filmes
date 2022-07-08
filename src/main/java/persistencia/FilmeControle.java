/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import dao.ExceptionDAO;
import java.util.ArrayList;
import negocio.Filme;

/**
 *
 * @author tais
 */
public class FilmeControle {
    
    public boolean cadastrarFilme(String titulo, String sinopse, int duracao) throws ExceptionDAO{
        if(titulo != null && titulo.length() > 0 && sinopse != null & sinopse.length() > 0 && duracao > 0){
            Filme filme = new Filme(titulo, sinopse, duracao);
            filme.cadastrarFilme(filme);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Filme> listarFilmes(String nome) throws ExceptionDAO{
        return new Filme().listarFilmes(nome);
    }
    
        public boolean alterarFilme(int codFilme, String titulo, String sinopse, int duracao) throws ExceptionDAO{
            if(titulo != null && titulo.length() > 0 && sinopse != null & sinopse.length() > 0 && duracao > 0){
                Filme filme = new Filme(titulo, sinopse, duracao);
                filme.setCodFilme(codFilme);
                filme.alterarFilme(filme);
                return true;
            }else{
                return false;
            }
    }
        
    public boolean apagarFilme(int codFilme) throws ExceptionDAO{
        if(codFilme == 0){
            return false;
        }else{
            Filme filme = new Filme();
            filme.setCodFilme(codFilme);
            filme.apagarFilme(filme);
            return true;
        }
    }
    
    public boolean avaliarFilme(int codFilme, int valor) throws ExceptionDAO{
        if(codFilme == 0){
            return false;
        }else{
            Filme filme = new Filme();
            filme.setCodFilme(codFilme);
            filme.setAvaliacao(valor);
            filme.avaliarFilme(filme);
            return true;
        }
    }
}
