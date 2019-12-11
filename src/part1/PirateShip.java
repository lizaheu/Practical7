package part1;


import java.util.*;

public class PirateShip {
  public Calendar promoStartDate;
  public Calendar promotEndDate;
  
  public double normalTicketPrice;
  public double discountRate;
  public double gstRate;

  public double calculateTicketPrice(Calendar date, int quantity) {
    double charge = quantity * normalTicketPrice;
    if (Promotion(date)) {
      charge =  charge + (charge * gstRate);
    }
    else {
      charge = charge * (1 - discountRate);
    }
    return charge;
  }

    public boolean Promotion(Calendar date) {
        return date.before(promoStartDate) || date.after(promotEndDate);
    }
}