public aspect Logger5 {

    pointcut success() : call(* jButton2ActionPerformed*(..) );
    after() : success() {
    	System.out.println("**** Negro ****");
    }