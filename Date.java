
public class Date {
   
   private String month,day ;
   private int daynum, year;
   
   public Date() {
	     
	   }
  
   public Date(String day,int daynum,String month,int year) {
      this.day=day;
      this.daynum=daynum;
      this.month = month;
      this.year = year;
    }
   

   public String getMonth() {
	return month;
}

public void setMonth(String month) {
	this.month = month;
}

public String getDay() {
	return day;
}

public void setDay(String day) {
	this.day = day;
}

public int getDaynum() {
	return daynum;
}

public void setDaynum(int daynum) {
	this.daynum = daynum;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public void setDate(String day,int daynum,String month,int year) {
    this.day=day;
    this.daynum=daynum;
    this.month = month;
    this.year = year;
  }
}