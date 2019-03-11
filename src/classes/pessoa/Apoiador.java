/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.pessoa;
import classes.dadoseleitorais.DadosEleitorais;

/**
 *
 * @author felipe
 */
public class Apoiador extends Pessoa {
    
    private String descricaoPessoal;
    private String filiacaoPartidaria;
    private DadosEleitorais dadosEleitorais;

    public String getDescricaoPessoal() {
        return descricaoPessoal;
    }

    public void setDescricaoPessoal(String descricaoPessoal) {
        this.descricaoPessoal = descricaoPessoal;
    }

    public String getFiliacaoPartidaria() {
        return filiacaoPartidaria;
    }

    public void setFiliacaoPartidaria(String filiacaoPartidaria) {
        this.filiacaoPartidaria = filiacaoPartidaria;
    }

    public DadosEleitorais getDadosEleitorais() {
        return dadosEleitorais;
    }

    public void setDadosEleitorais(DadosEleitorais dadosEleitorais) {
        this.dadosEleitorais = dadosEleitorais;
    }
}
