
public class AttendanceTracker {
	public static void main(String[] args)
	{
		AttendanceUtil util=new AttendanceUtil();
		try {
			 util.markAttendance("S1", "A101");
	         util.markAttendance("S1", "A102");
	         util.markAttendance("S2", "A101");
            // Duplicate case
            util.markAttendance("S1", "A101");
		}
		catch(DuplicateAttendanceException e)
		{
			System.out.println(e.getMessage());
		}
		util.displayAttendance();
		util.removeAttendance("S1","A102");
		System.out.println("after removal");
		util.displayAttendance();
		
	}
}
