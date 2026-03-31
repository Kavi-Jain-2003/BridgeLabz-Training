package event;

public class Food {
	String name;
	String location;
	String date;
	String cusine;
	int numStalls;
	int entryFee;
	Food(String name,String location,String date,String cusine,int numStalls,int entryFee)
	{
		this.name=name;
		this.location=location;
		this.date=date;
		this.cusine=cusine;
		this.numStalls= numStalls;
		this.entryFee=entryFee;
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
	public String getCusine() {
		return cusine;
	}
	public int getNumStalls() {
		return numStalls;
	}
	public int getEntryFee() {
		return entryFee;
	}
	@Override
	public String toString()
	{
		return "FestivalName:"+name+"\nLocation:"+location+"\ndate:"+date+"\nCusine:"+cusine+"\nNumber of Stalls:"+numStalls+"\nEntry Fee:"+entryFee;
	}
	
}
