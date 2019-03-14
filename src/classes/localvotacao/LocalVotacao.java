/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.localvotacao;
import classes.endereco.Endereco;
import classes.dadoseleitorais.DadosEleitorais;
import interfaces.ICadastro;
        
/**
 *
 * @author felipe
 */
public class LocalVotacao implements ICadastro{
    private Endereco endereco;
    private DadosEleitorais dadosEleitorais;
    private String nomeLocal;
    private int qtdEleitores;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public DadosEleitorais getDadosEleitorais() {
        return dadosEleitorais;
    }

    public void setDadosEleitorais(DadosEleitorais dadosEleitorais) {
        this.dadosEleitorais = dadosEleitorais;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public int getQtdEleitores() {
        return qtdEleitores;
    }

    public void setQtdEleitores(int qtdEleitores) {
        this.qtdEleitores = qtdEleitores;
    }

    @Override
    public void cadastrarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gerarRelatorio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
