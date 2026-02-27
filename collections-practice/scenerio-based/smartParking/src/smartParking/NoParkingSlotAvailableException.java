package smartParking;

public class NoParkingSlotAvailableException extends Exception{
		public NoParkingSlotAvailableException(String msg)
		{
			super(msg);
		}
}
