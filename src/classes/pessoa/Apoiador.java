/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.pessoa;
import classes.dadoseleitorais.DadosEleitorais;
import classes.endereco.Endereco;

/**
 *
 * @author felipe
 */
public class Apoiador extends Pessoa {
    
    
    
    private String descricaoPessoal;
    private String filiacaoPartidaria;
    private DadosEleitorais dadosEleitorais;

    public Apoiador(String nome, String dataNascimento, String telefone, 
            String email, String apelido, Endereco endereco, 
            String descricaoPessoal, String filiacaoPartidaria,
            DadosEleitorais dadosEleitorais) {
        super(nome, dataNascimento, telefone, email, apelido, endereco);
        this.descricaoPessoal = descricaoPessoal;
        this.filiacaoPartidaria = filiacaoPartidaria;
        this.dadosEleitorais = dadosEleitorais;
    }
    
    

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

    @Override
    public void cadastrarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gerarRelatorio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
