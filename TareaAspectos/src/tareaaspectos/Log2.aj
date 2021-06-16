public aspect Logger2{
    pointcut success() : call(* saveFile*(..) );
    after() : success() {
    //Aspecto muestra este mensaje luego de guardar un archivo
    	System.out.println("**** Archivo guardado ****");
    }
}