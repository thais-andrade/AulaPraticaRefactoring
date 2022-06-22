import java.util.Enumeration;

public class Statement {
    abstract String getCustomer(String name);
    abstract String getFigures(Rental each);
    abstract String getResult(Customer aCustomer);

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getCustomer(aCustomer.getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for each rental
            result += getFigures(each);
        }
        // add footer lines
        result += getResult(aCustomer);
        return result;
    }
}