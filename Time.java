package ex3;

public class Time {
	
     private int seconds;
     private int minutes;
     private int hours;
     
     Time(int seconds,int minutes,int hours) {
    	 
    	 this.seconds = seconds;
    	 this.minutes = minutes;
    	 this.hours = hours;
    	
    	 
     }
     public int getseconds() {
    	 
    	 return seconds;
     }
     public int getminutes() {
    	 
    	 return minutes;
    	 
     }
     public int gethours() {
    	 
    	 return hours;
    	 
     }
     public void setseconds(int seconds) {
    	 this.seconds = seconds;
    	 
     }
     public void setminutes(int minutes) {
    	
    	    this.minutes = minutes;
    	 }
   
     public void sethours(int hours) {
    	 this.hours = hours; 
    	
     }
     public String toString() {
    	 return this.gethours()+":"+this.getminutes()+":"+this.getseconds();
    	 
     }
}   

