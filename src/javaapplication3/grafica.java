/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author godoy
 */
public class grafica extends JFrame {
    protected static mxGraph graph= new mxGraph();
    protected static HashMap m= new HashMap();
    private mxGraphComponent graphComponent;
    private JTextField texto;
    private JButton botaoAdd;
    private JButton botaoLigar;
    private Object cell;
    
    public static HashMap getM(){
        return m;
        
    }
    public static mxGraph getGraph(){
        return graph;
    }
    public grafica(){
        super("JGraph - Fluxograma");
        initGUI();
    }
    
    private void initGUI(){
        setSize(800,600);
        setLocationRelativeTo(null);
        
       // graph= new mxGraph();
        graphComponent = new mxGraphComponent(graph);
        graphComponent.setPreferredSize(new Dimension(775,500));
        getContentPane().add(graphComponent);
        
        texto=new JTextField();
        getContentPane().add(texto);
        texto.setPreferredSize(new Dimension(600,20));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        botaoAdd= new JButton("AGREGAR");
        getContentPane().add(botaoAdd);
        botaoAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                AdicionarGrafo add= new AdicionarGrafo(texto.getText());
            }
        });
         botaoLigar= new JButton("UNIR");
        getContentPane().add(botaoLigar);
        botaoLigar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                AdicionarLinha linha= new AdicionarLinha();
            }
        });
        graphComponent.getGraphControl().addMouseListener(new MouseAdapter()
        {
            public void mouseReleased(MouseEvent e){
                cell=graphComponent.getCellAt(e.getX(), e.getY());
            }
        });
      /*  graph.getModel().beginUpdate();
        Object parent= graph.getDefaultParent();
        graph.insertVertex(parent,null,"Tester",30,80,100,50);
        graph.getModel().endUpdate();*/
      
     /*
             
			graph.insertEdge(parent, null, "", v3, v2);
                        graph.insertEdge(parent, null, "", v3, v4);
                        graph.insertEdge(parent, null, "", v4, v5); 
                        graph.insertEdge(parent, null, "", v4, v1);
                        graph.insertEdge(parent, null, "", v2, v6);
      
                           
     */
    

}
}
