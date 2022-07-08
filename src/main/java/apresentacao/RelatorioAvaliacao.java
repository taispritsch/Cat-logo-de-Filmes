/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.util.HashMap;
import negocio.Filme;
import utilReports.Report;

/**
 *
 * @author tais
 */
public class RelatorioAvaliacao implements Report{

    private Filme filme = new Filme();
    private int avaliacao; 
    
    public RelatorioAvaliacao(int avaliacao) {
        this.filme = new Filme();
        this.filme.setAvaliacao(avaliacao);
    }
    
    public void setAvaliacao(int ava){
        this.avaliacao = ava;
    }    
    
    public int getAvaliacao(){
        return this.avaliacao;
    }

    @Override
    public HashMap getParameters() {
        HashMap map = new HashMap();
        map.put("avaliacao", this.filme.getAvaliacao());
        
        return map;
    }

    @Override
    public String getPath() {
        return "/reports/RelatorioFilmesPorAvaliacao.jrxml";
    }
    
}
