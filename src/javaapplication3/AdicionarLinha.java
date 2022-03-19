/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import javax.swing.JOptionPane;

/**
 *
 * @author godoy
 */
public class AdicionarLinha extends grafica {
    public AdicionarLinha(){
        Object parent=this.getGraph().getDefaultParent();
        Object v1= this.getM().get(JOptionPane.showInputDialog("grafo 1:"));
        Object v2= this.getM().get(JOptionPane.showInputDialog("grafo 1:"));
       String nome= JOptionPane.showInputDialog("der/iz ");
       this.getGraph().insertEdge(parent, null, nome, v1, v2);
    }
}
