package validation;

import java.util.*;

public class Main {

    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String url = sc.nextLine();
            String[] urls=url.split("\\s+");
            for(String u:urls)
            {
            System.out.println(validateUrl(u));
            }
        }
    }

    public static String validateUrl(String url) {

        // 1. FORMAT CHECK
        if (!url.matches("^(http://|https://)[a-zA-Z]+\\.[a-zA-Z]+$")) {
            return "INVALID URL: format is invalid";
        }

        // 2. PROTOCOL CHECK
        if (!(url.startsWith("http://") || url.startsWith("https://"))) {
            return "INVALID URL: protocol is invalid";
        }

        // Remove protocol
        String newUrl = url.replaceFirst("^(http://|https://)", "");

        String[] split = newUrl.split("\\.");

        if (split.length != 2) {
            return "INVALID URL: format is invalid";
        }

        String website = split[0];
        String domain = "." + split[1];

        // 3. WEBSITE NAME CHECK
        if (!website.matches("^[a-z]{1,10}$")) {
            return "INVALID URL: website name is invalid";
        }

        // 4. DOMAIN CHECK ✅ FIXED
        if (!(domain.equals(".com") || domain.equals(".co") ||
              domain.equals(".in") || domain.equals(".org") ||
              domain.equals(".gov"))) {
            return "INVALID URL: domain is invalid";
        }

        // 5. DUPLICATE CHECK
        if (set.contains(url)) {
            return "DUPLICATE URL FOUND";
        }

        set.add(url);

        return "VALID URL";
    }
}
