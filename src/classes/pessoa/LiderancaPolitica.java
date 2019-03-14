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
public class LiderancaPolitica extends Apoiador {
    private double salario;
    private int potencialVotos;

    public LiderancaPolitica(String nome, String dataNascimento, String telefone, 
            String email, String apelido, Endereco endereco, String descricaoPessoal, 
            String filiacaoPartidaria, DadosEleitorais dadosEleitorais, 
            double salario, int potencialVotos) {
        
        super(nome, dataNascimento, telefone, email, apelido, endereco, 
                descricaoPessoal, filiacaoPartidaria, dadosEleitorais);
        this.salario = salario;
        this.potencialVotos = potencialVotos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPotencialVotos() {
        return potencialVotos;
    }

    public void setPotencialVotos(int potencialVotos) {
        this.potencialVotos = potencialVotos;
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
