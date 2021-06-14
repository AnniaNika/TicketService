
import java.util.*;
public class Time {

	int  hours ; 
    int  minutes;
	 String ampm;
	 
	 public Time() {}
	 public Time(int hours,int  minutes,String ampm) {
		 this.hours=hours; 
	    this.minutes=minutes;
		this.ampm=ampm;
		 
	 }
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public String getAmpm() {
		return ampm;
	}
	public void setAmpm(String ampm) {
		this.ampm = ampm;
	}
	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + ", ampm=" + ampm + "]";
	}
	 
   
   }
