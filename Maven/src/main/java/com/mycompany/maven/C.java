/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven;

/**
 *
 * @author Juanan
 */
public class C {
    
    private int valor;
    String info;

    public C() {
    }
    
    public C(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "C{" + "valor=" + valor + '}';
    }
    
}
