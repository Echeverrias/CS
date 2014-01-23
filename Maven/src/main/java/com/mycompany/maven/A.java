/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven;

/**
 *
 * @author Juanan
 */
public class A {
    
    private int valor;

    public A(int valor) {
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
        return "A{" + "valor=" + valor + '}';
    }
    
    
    
}
