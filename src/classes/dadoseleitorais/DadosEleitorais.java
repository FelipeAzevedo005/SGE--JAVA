/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.dadoseleitorais;

/**
 *
 * @author felipe
 */
public class DadosEleitorais {
    private int secaoEleitoral;
    private int zonaEleitoral;

    public DadosEleitorais(int secaoEleitoral, int zonaEleitoral) {
        this.secaoEleitoral = secaoEleitoral;
        this.zonaEleitoral = zonaEleitoral;
    }

    public int getSecaoEleitoral() {
        return secaoEleitoral;
    }

    public void setSecaoEleitoral(int secaoEleitoral) {
        this.secaoEleitoral = secaoEleitoral;
    }

    public int getZonaEleitoral() {
        return zonaEleitoral;
    }

    public void setZonaEleitoral(int zonaEleitoral) {
        this.zonaEleitoral = zonaEleitoral;
    }
    
}
