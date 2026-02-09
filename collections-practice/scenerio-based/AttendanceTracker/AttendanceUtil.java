import java.util.*;

public class AttendanceUtil {
	private Map<String, Set<String>> attendanceMap = new HashMap<>();

	public void markAttendance(String sessionId,String studentId) throws DuplicateAttendanceException
	{
		Set<String> students=attendanceMap.get(sessionId);
		if(students==null)
		{
			students=new HashSet<>();
			attendanceMap.put(sessionId,students);
		}
		if(students.contains(studentId))
		{
			throw new DuplicateAttendanceException("attendance already marked");
		}
		students.add(studentId);
	}
	public void removeAttendance(String sessionId,String studentId)
	{
		Set<String> students=attendanceMap.get(sessionId);
		if(students!=null)
		{
			students.remove(studentId);
			if(students.isEmpty())
			{
				attendanceMap.remove(sessionId);
			}
		}
	}
	public void displayAttendance()
	{
		for(Map.Entry<String,Set<String>> entry:attendanceMap.entrySet())
		{
			String key=entry.getKey();
			Set<String> values=entry.getValue();
			System.out.println("sessionID:"+key+" ["+values+"]");
		}
	}

}
