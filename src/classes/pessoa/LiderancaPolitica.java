/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.pessoa;

/**
 *
 * @author felipe
 */
public class LiderancaPolitica extends Pessoa {
    private double salario;
    private int pontencialVostos;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPontencialVostos() {
        return pontencialVostos;
    }

    public void setPontencialVostos(int pontencialVostos) {
        this.pontencialVostos = pontencialVostos;
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
