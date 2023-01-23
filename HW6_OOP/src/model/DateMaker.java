package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMaker {
    public String getDate() {
        String pattern = "DD/MM/YYYY-HH:MM:SS";
        DateFormat df = new SimpleDateFormat(pattern);
        Date now = Calendar.getInstance().getTime();
        return df.format(now);
    }
}
