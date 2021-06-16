public aspect Logger {

    pointcut success() : call(* openFile*(..) );
    after() : success() {
    //Aspecto muestra mensaje luego de abrir un archivo
    	System.out.println("**** Archivo abierto ****");
    }
    
    pointcut success() : call(* saveFile*(..) );
    after() : success() {
    //Aspecto muestra este mensaje luego de guardar un archivo
    	System.out.println("**** Archivo guardado ****");
    }
    
    pointcut success() : call(* update*(..) );
    after() : success() {
    //Aspecto muestra este mensaje luego de enviar email 
    	System.out.println("**** Notificado ****");
    }
    
}