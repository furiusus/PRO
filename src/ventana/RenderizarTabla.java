/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author furiusus
 */
public class RenderizarTabla extends DefaultTableCellRenderer{
    private int columna;
    public RenderizarTabla(int colPatron){
        this.columna=colPatron;
    }
    public Component getTableCellRenderizarTabla (JTable table, Object value, boolean selected, boolean focused, int row, int column){
        setBackground(Color.white);
        table.setForeground(Color.black);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        if(table.getValueAt(row,columna).equals("Listo"))
        {
            this.setForeground(Color.BLUE);
        }else if(table.getValueAt(row,columna).equals("Ejecutando")){
            this.setForeground(Color.GREEN);
        }else if(table.getValueAt(row, column).equals("Bloqueado")){
            this.setForeground(Color.red);
        }
        return this;
    }
}
