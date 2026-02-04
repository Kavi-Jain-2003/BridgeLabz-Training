package com.json;
import java.io.*;

public class CsvCensor {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("ipl.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("ipl_censored.csv"));

        String line = br.readLine(); // header
        bw.write(line);
        bw.newLine();

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            data[1] = CensorshipUtil.maskTeamName(data[1]); // team1
            data[2] = CensorshipUtil.maskTeamName(data[2]); // team2
            data[5] = CensorshipUtil.maskTeamName(data[5]); // winner
            data[6] = CensorshipUtil.redactPlayer();        // player_of_match

            bw.write(String.join(",", data));
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Censored CSV generated");
    }
}
