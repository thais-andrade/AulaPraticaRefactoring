import java.util.Enumeration;

public class HtmlStatement extends Statement {
   public String getCustomer(String name) {
        return "<H1>Rentals for <EM>" + name +
                "</EM></H1><P>\n";
    }

   public String getFigures(Rental each) {
        return each.getMovie().getTitle() + ": " +
                String.valueOf(each.getCharge()) + "<BR>\n";
    }
  
   public String getResult(Customer aCustomer) {
        return "<P>You owe <EM>" +
                String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
                "On this rental you earned <EM>" +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }
}