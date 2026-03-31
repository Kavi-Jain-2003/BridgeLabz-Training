package com.json;
import java.io.*;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class CSVToJSON {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        String line;

        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, String>> jsonList = new ArrayList<>();

        // Read header
        String[] headers = br.readLine().split(",");

        // Read data rows
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            Map<String, String> obj = new LinkedHashMap<>();

            for (int i = 0; i < headers.length; i++) {
                obj.put(headers[i], values[i]);
            }
            jsonList.add(obj);
        }

        br.close();

        // Convert to JSON
        String json = mapper.writerWithDefaultPrettyPrinter()
                            .writeValueAsString(jsonList);

        System.out.println(json);
    }
}
