/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_y_polimorfismo;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Hija h = new Hija();
       h.alimento="carne"; 
       h.numPiernas=2;
       h.colorPelo="rojo";
       h.mostrar();
    }
    
    
}
