/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creararboles;

/**
 *
 * @author Juanan
 */
public class CArbol {
    
    String nombre, zona;
    int altmedia;
    int peso;
    String commit1;
    String commit2;

    public CArbol() {
    }

    public CArbol(String nombre, String zona, int altmedia) {
        this.nombre = nombre;
        this.zona = zona;
        this.altmedia = altmedia;
        this.commit1="hola";
        this.commit2="adios";
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getAltmedia() {
        return altmedia;
    }

    public void setAltmedia(int altmedia) {
        this.altmedia = altmedia;
    }

    @Override
    public String toString() {
        return nombre + "\t" + zona + "\t" + altmedia;
    }
    
    
    
    
}
