package com.junit_testing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public String formatDate(String inputDate) {
        try {
            // Input format: yyyy-MM-dd
            SimpleDateFormat inputFormat =
                    new SimpleDateFormat("yyyy-MM-dd");
            inputFormat.setLenient(false);

            // Output format: dd-MM-yyyy
            SimpleDateFormat outputFormat =
                    new SimpleDateFormat("dd-MM-yyyy");

            Date date = inputFormat.parse(inputDate);
            return outputFormat.format(date);

        } catch (ParseException e) {
            return "Invalid Date";
        }
    }
}
