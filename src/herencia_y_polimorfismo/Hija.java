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
public class Hija extends Padre {
    String colorPelo;

    
    @Override
    public final void  mostrar() {
        super.mostrar();
        System.out.println(colorPelo); 
    }
    
}