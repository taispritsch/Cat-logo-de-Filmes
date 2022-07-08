/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.util.HashMap;
import negocio.Filme;
import utilReports.Report;
import java.lang.String;

/**
 *
 * @author tais
 */
public class RelatoriosDuracao implements Report{
    
    private Filme filme;
    private int duracao; 

    public RelatoriosDuracao(int duracao) {
        this.filme = new Filme();
           this.filme.setDuracao(duracao);
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }    
    
    public int getDuracao(){
        return this.duracao;
    }

    @Override
    public HashMap getParameters() {
        HashMap map;
        map = new HashMap();
        map.put("duracao", this.filme.getDuracao());
        
        return map;
    }

    @Override
    public String getPath() {
        return "/reports/RelatorioPorDuracao.jrxml";
    }
}
