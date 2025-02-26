/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JFrame;
import wiie.gui.JFrameEmpleados;
import wiie.gui.JFrameHome;
import wiie.gui.JFrameEntradas;
import wiie.gui.JFrameClientes;

/**
 *
 * @author oscarfabrod
 */
public class DataClass {
    
    public static JFrameHome JFH;
    public static JFrameEmpleados JFE = new JFrameEmpleados();
    public static JFrameEntradas JFN = new JFrameEntradas();
    public static JFrameClientes JFC = new JFrameClientes();
    
    public static void setVisible(){
        DataClass.JFH.setVisible(true);
        DataClass.JFN.setVisible(false);
        DataClass.JFC.setVisible(false);
        DataClass.JFE.setVisible(false);
    
    }
    public static void goToAnotherFrame (JFrame JFO, JFrame JFD){
        JFO.setVisible(false);
        JFD.setVisible(true);
    
    
    }

}
