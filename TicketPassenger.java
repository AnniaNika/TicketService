
public class TicketPassenger {
	
	String flight;
	Time boardTime;
	String gate;
	String seat;
	String seat2;
	String namePassenger;
	String from;
	String to;
	Date d1;
	int idticket;
    float costTicket;
	
     public TicketPassenger() {};
	 public TicketPassenger(String flight,Time boardTime,String gate,String seat,String seat2,String namePassenger,String from,String to,Date d1,int idticket,float costTicket) {
		
		 this.flight=flight;
			 this.boardTime=boardTime;
			 this.gate=gate;
			 this.seat=seat;
			 this.seat2=seat2;
			 this.namePassenger=namePassenger;
			 this.from=from;
			 this.to=to;
			 this.d1=d1;
			 this.idticket=idticket;
			 this.costTicket=costTicket;
			 
	    }

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public Time getBoardTime() {
		return boardTime;
	}

	public void setBoardTime(Time boardTime) {
		this.boardTime = boardTime;
	}

	public String getGate() {
		return gate;
	}

	public void setGate(String gate) {
		this.gate = gate;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getSeat2() {
		return seat2;
	}

	public void setSeat2(String seat2) {
		this.seat2 = seat2;
	}

	public String getNamePassenger() {
		return namePassenger;
	}

	public void setNamePassenger(String namePassenger) {
		this.namePassenger = namePassenger;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getD1() {
		return d1;
	}

	public void setD1(Date d1) {
		this.d1 = d1;
	}

	public int getIdticket() {
		return idticket;
	}

	public void setIdticket(int idticket) {
		this.idticket = idticket;
	}

	public float getCostTicket() {
		return costTicket;
	}

	public void setCostTicket(float costTicket) {
		this.costTicket = costTicket;
	}

	
	/*public float compare(TicketPassenger t1,TicketPassenger t2) {
		
		float tt1=t1.getCostTicket();
		float tt2=t2.getCostTicket();
		return ;
	}
	*/
		 
	
	@Override
	public String toString() {
		return "TicketPassenger [flight=" + flight + ", boardTime=" + boardTime + ", gate=" + gate + ", seat=" + seat
				+ ", seat2=" + seat2 + ", namePassenger=" + namePassenger + ", from=" + from + ", to=" + to + ", d1="
				+ d1 + ", idticket=" + idticket + ", costTicket=" + costTicket + "]";
	}

	
	

}
