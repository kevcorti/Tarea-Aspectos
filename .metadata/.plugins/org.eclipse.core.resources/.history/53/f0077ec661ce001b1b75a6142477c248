package tareaaspectos;
1import Editor.Editor;
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
