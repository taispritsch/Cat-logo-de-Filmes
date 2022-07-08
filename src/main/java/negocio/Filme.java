/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dao.ExceptionDAO;
import dao.FIlmeDAO;
import java.util.ArrayList;

/**
 *
 * @author tais
 */
public class Filme {
    
    private int codFilme;
    private String titulo;
    private String sinopse;
    private int duracao;
    private int avaliacao;
    
    public Filme(){
        
    }

    public Filme(int codFilme, String titulo, String sinopse, int duracao) {
        this.codFilme = codFilme;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    public Filme(String titulo, String sinopse, int duracao)
    {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    public int getCodFilme() {
        return codFilme;
    }

    public void setCodFilme(int codFilme) {
        this.codFilme = codFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public int getAvaliacao(){
        return avaliacao;
    }
    
    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }
    
    public void cadastrarFilme(Filme filme) throws ExceptionDAO{
        new FIlmeDAO().cadastrarFilme(filme);
    }
    
    public ArrayList<Filme> listarFilmes(String nome) throws ExceptionDAO{
        return new FIlmeDAO().listarFilme(nome);
    }
    
    public void alterarFilme(Filme filme) throws ExceptionDAO{
        new FIlmeDAO().alterarFilme(filme);
    }
    
    public void apagarFilme(Filme filme) throws ExceptionDAO{
        new FIlmeDAO().apagarFilme(filme);
    }
    
    public void avaliarFilme(Filme filme) throws ExceptionDAO{
        new FIlmeDAO().avaliarFilme(filme);
    }
}
