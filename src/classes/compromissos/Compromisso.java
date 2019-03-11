/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.compromissos;
import  classes.endereco.Endereco;

/**
 *
 * @author felipe
 */
public class Compromisso {
    private Endereco endereco;
    private String tipoCompromisso;
    private String descricao;
    private String responsavel;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTipoCompromisso() {
        return tipoCompromisso;
    }

    public void setTipoCompromisso(String tipoCompromisso) {
        this.tipoCompromisso = tipoCompromisso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
