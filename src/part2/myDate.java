package part2;

import java.util.Calendar;

public final class myDate {
    private Calendar startDate;
    private Calendar endDate;  

    public Calendar getStartDate() {
        return startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }
    
    public int getDay(){
        return Calendar.DAY_OF_YEAR;
    }
}
