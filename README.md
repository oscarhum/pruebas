# pruebas
public class UsuarioFrame2 extends JFrame{
   private JTable table;
    
   public  UsuarioFrame2 ()  {
	   Object[][] data=leerusuarios();
	  Object[] columnNames ={"NOMBRES","APELLIDOS","CORREO","EDAD"};
	  table =new JTable(data,columnNames);
	  JScrollPane scrollPane= new JScrollPane(table);
	  table.setFillsViewportHeight(true);
	  add(scrollPane);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setSize(new Dimension (400,400));
	  setVisible(true);
   }
	private Object[][] leerusuarios()   {
		Object[][] data;
		try {
			BufferedReader br = new  BufferedReader(new FileReader("usuarios.txt"));
			String linea= br.readLine();
			int numFilas=Integer.parseInt(linea);
			data= new Object [numFilas][4];
			for(int i=0;i<numFilas;i++){
				linea=br.readLine();
				String[] datosUsuario=linea.split(";");
				for(int j=0;j<4;j++){
					data [i][j]=datosUsuario[j];
					System.out.println(br.readLine());
					
					br.close();
				}
				
			}
			
		} catch (IOException ex) {
			
			System.out.println(ex.getMessage());
			data= new Object[0][4];
		}
	return data;
}
	public static void main(String[] args)  {
		new UsuarioFrame2();

	}

}
	

