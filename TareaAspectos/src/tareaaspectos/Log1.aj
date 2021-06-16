public aspect Logger1 {

    pointcut success() : call(* openFile*(..) );
    after() : success() {
    //Aspecto muestra mensaje luego de abrir un archivo
    	System.out.println("**** Archivo abierto ****");
    }