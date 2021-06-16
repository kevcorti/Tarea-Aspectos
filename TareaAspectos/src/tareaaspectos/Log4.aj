public aspect Logger4 {

    pointcut success() : call(* jButton1ActionPerformed*(..) );
    after() : success() {
    	System.out.println("**** AZUL ****");
    }