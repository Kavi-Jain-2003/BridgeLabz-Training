package event;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Art> aList = new ArrayList<>();
		List<Food> fList = new ArrayList<>();
		List<Music> mList = new ArrayList<>();
		Art a = null;
		Music m = null;
		Food f = null;
		while (true) {
			String input = sc.nextLine();
			String[] split = input.split(" ");
			if (split[0].equals("ADD_FESTIVAL") && split.length == 8) {
				String name = split[2];
				String location = split[3];
				String date = split[4];
				if (split[1].equals("ART")) {
					String artType = split[5];
					int numArtists = Integer.parseInt(split[6]);
					int exhibitionFee = Integer.parseInt(split[7]);
					a = new Art(name, location, date, artType, numArtists, exhibitionFee);
					aList.add(a);
				} else if (split[1].equals("FOOD") && split.length == 8) {
					String cusine = split[5];
					int numStalls = Integer.parseInt(split[6]);
					int entryFee = Integer.parseInt(split[7]);
					f = new Food(name, location, date, cusine, numStalls, entryFee);
					fList.add(f);

				} else if (split[1].equals("MUSIC") && split.length == 8) {
					String headliner = split[5];
					String musicGenre = split[6];
					int ticketPrice = Integer.parseInt(split[7]);
					m = new Music(name, location, date, headliner, musicGenre, ticketPrice);
					mList.add(m);
				}
			}
			if (split[0].equals("DISPLAY_DETAILS")) {
				String festivalName = split[1];
				for (Art art : aList) {
					if (art.getName().equals(festivalName)) {
						System.out.println(art);
					}
				}
				for (Food food : fList) {
					if (food.getName().equals(festivalName)) {
						System.out.println(food);
					}
				}
				for (Music music : mList) {
					if (music.getName().equals(festivalName)) {
						System.out.println(music);
					}
				}
			}
			if (split[0].equals("EXIT")) {
				System.out.println("exiting");
				return;
			}
		}
	}
}
