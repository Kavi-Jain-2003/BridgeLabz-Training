package com.json;

public class CensorshipUtil {
	public static String maskTeamName(String team)
	{
		String[] parts=team.split(" ");
		return parts[0]+"***";
		}
	public static String redactPlayer()
	{
		return "REDACTED";
	}
}
