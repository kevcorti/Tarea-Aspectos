package tareaaspectos;
import Editor.Editor;

import Listener.EmailNotificationListener;
import Listener.LogOpenListener;
import Ventana_Parte2.Ventana;
import java.util.scanner;

public class TareaAspectos {
    public static void main(String[] args) {
    	Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    Ventana.main(args);
    }
    //Adem?s, debe realizar alguna funcionalidad adicional (aspecto) que ejemplifique de mejor manera
    //la separaci?n de requerimientos (core y cross cutting concerns), agregue la descripci?n de 
    //dicha funcionalidad en el archivo README.md de su repositorio.
    
	 public void updateFile() {   
	    String palabra;     
	    Scanner sc = new Scanner(System.in);
	
	    do {
	
	        System.out.print("Introduce una palabra (SALIR para salir): ");
	        palabra = sc.nextLine();
	
	        EscribirFichero(palabra);
	
	    }while(!palabra.equals("SALIR"));
	
	    System.out.println("Fichero creado");
	    sc.close();
	 }
   
}
