package ship;

import java.util.*;

public class shipUtil {

//	List<ShipmentCode> shipList = new ArrayList<>();
//	public void addShip(ShipmentCode s)
//	{
//		shipList.add(s);
//	}
	public boolean checkComplaint(ShipmentCode s) {
		String coderegex = "^SHIP-(?!.*(\\d)\1{3})[1-9]\\d{5}$";
		if (!s.getCode().matches(coderegex)) {
			return false;
		}
		

		String[] splitdate = s.getDate().split("-");
		int year = Integer.parseInt(splitdate[0]);
		int month = Integer.parseInt(splitdate[1]);
		int date = Integer.parseInt(splitdate[2]);
		if (year < 2000 || year > 2099) {
			return false;
		}
		if (month < 1 || month > 12) {
			return false;
		}
		boolean leap = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
		
		int maxDay;
		if (month == 2) {
			maxDay = leap ? 29 : 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			maxDay = 30;
		} else {
			maxDay = 31;
		}
		if (date < 1 || date > maxDay) {
			return false;
		}
		
		String moderegex = "AIR|SEA|ROAD|RAIL|EXPRESS|FREIGHT";
		if (!s.getMode().matches(moderegex)) {
			return false;
		}
		
		String wregex = "^(0|[1-9]\\d{0,5})(\\.\\d{1,2})?$";
		if(!s.getWeight().matches(wregex))
		{
			return false;
		}
		double weight=Double.parseDouble(s.getWeight());
		if (weight < 0 || weight > 999999.99) {
			return false;
		}
		
		
		String statusregex = "DELIVERED|CANCELLED|IN_TRANSIT";
		if (!s.getStatus().matches(statusregex)) {
			return false;
		}

		return true;
	}
}
