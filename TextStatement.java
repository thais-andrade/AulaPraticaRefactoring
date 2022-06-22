import java.util.Enumeration;

public class TextStatement extends Statement {
   public String getCustomer(String name) {
        return "Rental Record for " + name + "\n";
    }

   public String getFigures(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" +
                String.valueOf(each.getCharge()) + "\n";
    }

   public String getResult(Customer aCustomer) {
        return "Amount owed is " +
                String.valueOf(aCustomer.getTotalCharge()) + "\n" +
                "You earned " +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
   }
}