/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.dadosvalores;

import interfaces.ICadastro;

/**
 *
 * @author felipe
 */
public class Receita implements ICadastro{
    private String nome;
    private String numeroDocumento;
    private double valor;
    private String dataPagamento;

    public Receita(String nome, String numeroDocumento, double valor, String dataPagamento) {
        this.nome = nome;
        this.numeroDocumento = numeroDocumento;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }
    
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
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
