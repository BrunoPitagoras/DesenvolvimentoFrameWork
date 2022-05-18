/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brunojsc2;

import com.sun.javafx.embed.swing.Disposer;
import javax.swing.JFrame;

/**
 *
 * @author Bruno Josue
 */
public class Tela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            JFrame janela = new JanelaPrincipal();
            janela.setVisible(true);
            janela.setLocationRelativeTo(null);
            
        
    }
    
}
