package com.json;
import com.fasterxml.jackson.databind.*;
import java.io.File;
import java.util.*;

public class JsonCensor {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        List<Map<String, Object>> matches =
                mapper.readValue(new File("ipl.json"), List.class);

        for (Map<String, Object> match : matches) {

            String team1 = (String) match.get("team1");
            String team2 = (String) match.get("team2");

            match.put("team1", CensorshipUtil.maskTeamName(team1));
            match.put("team2", CensorshipUtil.maskTeamName(team2));
            match.put("winner", CensorshipUtil.maskTeamName((String) match.get("winner")));
            match.put("player_of_match", CensorshipUtil.redactPlayer());
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("ipl_censored.json"), matches);

        System.out.println("Censored JSON generated");
    }
}
