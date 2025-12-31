//Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.

public class HotelBookingSystem {
	// attributes
	String guestName;
	String roomType;
	int nights;
	HotelBookingSystem()
	{
		guestName="Ajay";
		roomType="AC";
		nights=2;
	}
	// parametrized constructor
	HotelBookingSystem(String guestName,String roomType, int nights)
	{
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	HotelBookingSystem(HotelBookingSystem h)
	{
		this.guestName=h.guestName;
		this.roomType=h.roomType;		
		this.nights=h.nights;
	}

	// instance method
	void displayDetail() {
		System.out.println("Guest name:" + guestName);
		System.out.println("RoomType:" + roomType);
		System.out.println("Nights:" + nights);
	}

	public static void main(String[] args) {
		HotelBookingSystem h1= new HotelBookingSystem("Pooja","AC",4);
		h1.displayDetail();
		HotelBookingSystem h2= new HotelBookingSystem(h1);
		h2.displayDetail();
		
	}
}


