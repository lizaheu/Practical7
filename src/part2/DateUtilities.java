package part2;

import java.util.*;

public class DateUtilities {
  
  public boolean validate(myDate a) {
    return (a.getStartDate().compareTo(a.getEndDate())<= 0);
  }
 
  public static int countTotalDays(myDate a) {
    int totalDays = a.getEndDate().get(a.getDay()) - a.getStartDate().get(a.getDay()) + 1;
    return totalDays;
  }
  
}

