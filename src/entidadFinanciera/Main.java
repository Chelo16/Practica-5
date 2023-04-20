/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 *
 * @author Angel
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    
    }
    
    /**
     *
     * @param c
     * @param cantidad
     * @throws Exception
     */
    public static void probarIngresar(CCuenta c, int cantidad) throws Exception{
        c.ingresar(cantidad);
        
    }
    
    /**
     *
     * @param c
     * @param cantidad
     * @throws Exception
     */
    public static void probarRetirar(CCuenta c, int cantidad) throws Exception{
        c.retirar(cantidad);
    }
}
