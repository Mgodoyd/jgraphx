/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javax.swing.JFrame;

/**
 *
 * @author godoy
 */
public class main {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
      
        Arbolavl arbol= new Arbolavl();
        //arbol.insert(arbol.raiz, 20);  //mi raiz no tomaba el nuevo valor
   arbol.raiz= arbol.insert(arbol.raiz, 20);///no estoy mandado por referencia
   arbol.raiz= arbol.insert(arbol.raiz, 15);
   arbol.raiz= arbol.insert(arbol.raiz, 25);
   arbol.raiz= arbol.insert(arbol.raiz, 5);  
   arbol.raiz= arbol.insert(arbol.raiz, 4); 
    
 grafica a = new grafica();
     a.setVisible(true);
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
    
    
    }
    
}
