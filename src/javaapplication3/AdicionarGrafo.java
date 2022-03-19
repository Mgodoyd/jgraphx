/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author godoy
 */
public class AdicionarGrafo extends grafica {
    public AdicionarGrafo(String nome){
        this.getGraph().getModel().beginUpdate();
        Object parent= this.getGraph().getDefaultParent();
        Object v1= this.getGraph().insertVertex(parent,null,nome,330,30,100,50);
        this.getM().put(nome,v1);
        this.getGraph().getModel().endUpdate();
        
    }
    
}
