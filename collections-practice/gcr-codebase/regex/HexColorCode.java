import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
	public static void main(String[] args) {
		String username = "#FFaf00";
		String regex = "^#[\\dA-Fa-f]{6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(username);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}
}