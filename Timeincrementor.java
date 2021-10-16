package ex3;

public class Timeincrementor implements Runnable {
       private Time t;
       private GraphicalClock hg;
       
       Timeincrementor(Time t,GraphicalClock hg){
    	   this.t = t;
    	   this.hg = hg;
    	   
       }
	   
	   public void run() {
		    
	   
	   while (true) {
		   
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   if (t.getseconds() + 1 == 60) {
			   t.setseconds(0);
			   if (t.getminutes()+1 == 60) {
		          t.setminutes(0);
		          if (t.gethours()+1 == 24) {
		             t.sethours(0);
		          }
		          else {
		        	 t.sethours(t.gethours()+1);
		        	  
		          }
	       }
			   else {
				   t.setminutes(t.getminutes()+1);
				   
				   
			   }
		   }
		   else {
			   t.setseconds(t.getseconds()+1);
		   }
		   System.out.println(t.gethours()+":"+t.getminutes()+ ":"+t.getseconds());
		  
	      hg.setText(""+t.toString());
	   
	    
	   }




}
}
