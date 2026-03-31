package college;

import java.util.*;

class ProjectTeam {
	String teamId;
	String section;
	String domain;
	String projectName;
	int projectScore;

	ProjectTeam(String teamId, String section, String domain, String projectName, int projectScore) {
		this.teamId = teamId;
		this.section = section;
		this.domain = domain;
		this.projectName = projectName;
		this.projectScore = projectScore;
	}

	public String getTeamId() {
		return teamId;
	}

	public String getDomain() {
		return domain;
	}

	public int getProjectScore() {
		return projectScore;
	}

	public void setProjectScore(int projectScore) {
		this.projectScore = projectScore;
	}

	public String toString() {
		return teamId + " " + section + " " + domain + " " + projectName + " " + projectScore;
	}
}

class CompetitionManager {
	static List<ProjectTeam> list = new ArrayList<>();

	public static boolean findTeam(String teamId) {
		for (ProjectTeam p : list) {
			if (p.getTeamId().equals(teamId)) {
				return true;
			}
		}
		return false;
	}

	public static int registerTeam(String teamId, String section, String domain, String projectName, int projectScore) {
		if (!findTeam(teamId)) {
			list.add(new ProjectTeam(teamId, section, domain, projectName, projectScore));
//			System.out.println("team registered");
		}
		return 1;
	}

	public static int reviseScore(String teamId, int projectScore) {
		for (ProjectTeam p : list) {
			if (p.getTeamId().equals(teamId)) {
				p.setProjectScore(projectScore);
				return 1;
//					System.out.println("REVISED" + " " + p.getTeamId() + " " + p.getProjectScore());
			}
		}
		return 0;
	}

	public static List<ProjectTeam> filterByDomain(String domain) {
		List<ProjectTeam> specificDomain = new ArrayList<>();
		for (ProjectTeam p : list) {
			if ((p.getDomain().equals(domain))) {
				specificDomain.add(p);
			}
		}
		return specificDomain;
	}

	public static List<ProjectTeam> qualifyTeam(int cutoff) {
		List<ProjectTeam> qualifySt = new ArrayList<>();
		for (ProjectTeam p : list) {
			if (p.getProjectScore() >= cutoff) {
				qualifySt.add(p);
			}
		}
		return qualifySt;
	}
}

public class Main {
	static CompetitionManager cm = new CompetitionManager();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> output = new ArrayList<>();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			String[] parts = input.split("\\s+");
			String operation = parts[0];
			if (operation.equalsIgnoreCase("REGISTER")) {
				String teamId = parts[1];
				String section = parts[2];
				String domain = parts[3];
				String projectName = parts[4];
				boolean exists = cm.findTeam(teamId);
				int projectScore = Integer.parseInt(parts[5]);
				if (exists) {
					output.add("team is already present");
				} else {
					cm.registerTeam(teamId, section, domain, projectName, projectScore);
				}
			} else if (operation.equalsIgnoreCase("REVISE")) {
				String teamId = parts[1];
				int projectScore = Integer.parseInt(parts[2]);
				boolean exists = cm.findTeam(teamId);
				if (exists) {
					cm.reviseScore(teamId, projectScore);
					output.add("REVISED" + " " + teamId + " " + projectScore);
				} else {
					output.add("team is not present");
				}
			} else if (operation.equalsIgnoreCase("FILTERDOMAIN")) {
				String domain = parts[1];
				List<ProjectTeam> specificDomain = cm.filterByDomain(domain);
				if(specificDomain.isEmpty())
				{
					output.add("no team of such domain: "+domain);
				}
				else
				{
					for(ProjectTeam p:specificDomain)
					{
						output.add(p.toString());
					}
				}				

			} else if (operation.equalsIgnoreCase("QUALIFY")) {
				int cutoff = Integer.parseInt(parts[1]);
				List<ProjectTeam> qualifySt = cm.qualifyTeam(cutoff);
				if(qualifySt.isEmpty())
				{
					output.add("no team qualified");
				}
				else
				{
					for(ProjectTeam p:qualifySt)
					{
						output.add(p.toString());
					}
				}
			}
		}
		for(String s:output)
		{
			System.out.println(s);
		}
	}
}
