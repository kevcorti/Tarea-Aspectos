/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaaspectos;
import Editor.Editor;
import Listener.EmailNotificationListener;
import Listener.LogOpenListener;
import Ventana_Parte2.Ventana;





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
    
   
}
