/*
Este código es educacional, sirve para declarar funciones usando orientación a objetos 
e instancias, envío de parámetros y captura / impresión de datos usando javax.swing.JOptionPane
*/
package funcionesqueretornan;

import javax.swing.JOptionPane;
/**
 * @author davidmramirez
 */
public class FuncionesqueRetornan {
  
    public static void main(String[] args) {
        //declaración de variable instancia (inst) para la función
        FuncionesqueRetornan inst = new FuncionesqueRetornan();
        
        String dato = JOptionPane.showInputDialog("Ingrese dato: ");
        int d = Integer.parseInt(dato);
        
        //enviamos el dato "d" que está entre paréntesis al método (función) inst.multiplicar para que retorne una operación
        JOptionPane.showMessageDialog(null, "El dato ingresado, multiplicado por 5 es: " + inst.multiplicar(d));
    }
    //método (función) para hacer la operación afuera del main()
    public int multiplicar(int a){
        return a*5;
    }
    
}
