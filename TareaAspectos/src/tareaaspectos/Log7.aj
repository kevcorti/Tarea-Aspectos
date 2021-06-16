public aspect Logger7 {
    pointcut success() : call(* updateFile*(..) );
    after() : success() {
    	System.out.println("**** Archivo actualizado ****");
    }