public abstract class Price {
   public abstract int getPriceCode();

   public double getCharge(int daysRented) {
      switch (getPriceCode()) {
           double charge = 0.0;
           case REGULAR:
              charge += 2;
              if (daysRented > 2)
                 charge += (daysRented - 2) * 1.5;
              return charge;
           case NEW_RELEASE:
              charge += daysRented * 3;
              return charge;
           case CHILDRENS:
              charge += 1.5;
              if (daysRented > 3)
                 charge += (daysRented - 3) * 1.5;
               return charge;
        }
   }
}