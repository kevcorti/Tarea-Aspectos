public aspect Logger6 {

    pointcut success() : call(* jButton3ActionPerformed*(..) );
    after() : success() {
    	System.out.println("**** Rojo ****");
    }