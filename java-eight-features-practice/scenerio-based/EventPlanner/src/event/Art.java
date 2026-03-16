package event;

public class Art {
	String name;
	String location;
	String date;
	String artType;
	int numArtists;
	int exhibitionFee;
	Art(String name,String location,String date,String artType,int numArtists,int exhibitionFee)
	{
		this.name=name;
		this.location=location;
		this.date=date;
		this.artType=artType;
		this.numArtists= numArtists;
		this.exhibitionFee=exhibitionFee;
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
	public String getArtType() {
		return artType;
	}
	public int getNumArtists() {
		return numArtists;
	}
	public int getExhibitionFee() {
		return exhibitionFee;
	}
	@Override
	public String toString()
	{
		return "FestivalName:"+name+"\nLocation:"+location+"\ndate:"+date+"\nArtTpe:"+artType+"\nNumber of atists:"+numArtists+"\nTicket Price:"+exhibitionFee;
	}
	
}
