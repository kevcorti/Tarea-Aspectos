public aspect Logger3{
    pointcut success() : call(* update*(..) );
    after() : success() {
    //Aspecto muestra este mensaje luego de enviar email 
    	System.out.println("**** Notificado ****");
    }
}