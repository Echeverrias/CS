package com.mycompany.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Programa de prueba\n" );
        
        A claseA= new A(5);
        B claseB= new B(5);
        C claseC= new C();
        int valor;
        valor= claseA.getValor()+claseB.getValor();
        claseC.setValor(valor);
         System.out.println( claseC.toString());
    }
}
