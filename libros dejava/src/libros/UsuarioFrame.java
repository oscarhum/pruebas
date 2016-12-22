package libros;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UsuarioFrame extends JFrame{
   private JTable table;
    
   public  UsuarioFrame () {
	   Object[] [] data= {
			   {"andres","rodrigues","andres@poligran.edu.co",18},
			   {"juan","hernandes","juan@poligran.edu.co",20},
			   {"maria","castro","maria@poligran.edu.co",30},
			   {"david","peña","david@poligran.edu.co",26}
	   };
	  Object[] columnNames ={"NOMBRES","APELLIDOS","CORREO","EDAD"};
	  table =new JTable(data,columnNames);
	  JScrollPane scrollPane= new JScrollPane(table);
	  table.setFillsViewportHeight(true);
	  add(scrollPane);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setSize(new Dimension (400,400));
	  setVisible(true);
   }
	public static void main(String[] args) {
		new UsuarioFrame();

	}

}
