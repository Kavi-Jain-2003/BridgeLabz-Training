package event;

public class Music {
	String name;
	String location;
	String date;
	String headliner;
	String musicGenre;
	int ticketPrice;
	Music(String name,String location,String date,String headliner,String musicGenre,int ticketPrice)
	{
		this.name=name;
		this.location=location;
		this.date=date;
		this.headliner=headliner;
		this.musicGenre= musicGenre;
		this.ticketPrice=ticketPrice;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public String getDate() {
		return date;
	}
	public String getHeadliner() {
		return headliner;
	}
	public String getMusicGenre() {
		return musicGenre;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	@Override
	public String toString()
	{
		return "FestivalName:"+name+"\nLocation:"+location+"\ndate:"+date+"\nHeadliner:"+headliner+"\nMusic genre:"+musicGenre+"\nTicket Price:"+ticketPrice;
	}
}

