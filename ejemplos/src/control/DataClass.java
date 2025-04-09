/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JFrame;
import wiie.gui.JFrameAtracciones;
import wiie.gui.JFrameEmpleados;
import wiie.gui.JFrameHome;
import wiie.gui.JFrameEntradas;
import wiie.gui.JFrameClientes;
import wiie.gui.JFrameSocios;
import wiie.gui.JFrameEmpleadosAñadir;
import wiie.gui.JFrameSociosAñadir;

/**
 *
 * @author oscarfabrod
 */
public class DataClass {
    
    public static JFrameHome JFH;
    public static JFrameEmpleados JFE = new JFrameEmpleados();
    public static JFrameEntradas JFN = new JFrameEntradas();
    public static JFrameClientes JFC = new JFrameClientes();
    public static JFrameAtracciones JFA = new JFrameAtracciones();
    public static JFrameSocios JFS = new JFrameSocios();
    public static JFrameEmpleadosAñadir JFEA = new JFrameEmpleadosAñadir();
    public static JFrameSociosAñadir JFSA = new JFrameSociosAñadir();
    
    public static void setVisible(){
        DataClass.JFH.setVisible(true);
        DataClass.JFN.setVisible(false);
        DataClass.JFC.setVisible(false);
        DataClass.JFE.setVisible(false);
        DataClass.JFA.setVisible(false);
        DataClass.JFS.setVisible(false);
        DataClass.JFEA.setVisible(false);
        DataClass.JFSA.setVisible(false);
    
    }
    public static void goToAnotherFrame (JFrame JFO, JFrame JFD){
        JFO.setVisible(false);
        JFD.setVisible(true);
    
    
    }

}
