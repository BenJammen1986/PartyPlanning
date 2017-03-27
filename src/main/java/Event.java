

public class Event {
  private String mName;
  private Integer mGuests;
  private String mMeal;
  private String mDrinks;
  private String mEntertainment;
  private String mCoupon;

    public Event(String name, Integer guests, String meal, String drinks, String entertainment, String coupon) {
      mName = name;
      mGuests = guests;
      mMeal = meal;
      mDrinks = drinks;
      mEntertainment = entertainment;
      mCoupon = coupon;
    }

  public String getName() {
    return mName;
  }

  public Integer getGuests() {
    return mGuests;
  }

  public String getMeal() {
    return mMeal;
  }

  public String getDrinks() {
    return mDrinks;
  }

  public String getEntertainment() {
    return mEntertainment;
  }

  public String getCoupon() {
    return mCoupon;
  }

  public String calculatePrice() {
    Integer totalPrice = 0;

    //calculate base price for package
    if ( mGuests >= 150 ) {
      totalPrice += 1200;
    } else if ( (mGuests >= 100) && (mGuests< 150) ) {
      totalPrice += 1100;
    } else if ( (mGuests >= 75) && (mGuests< 100) ) {
      totalPrice += 1000;
    } else if ( (mGuests >= 50) && (mGuests< 75) ) {
      totalPrice += 800;
    } else if ( mGuests < 50) {
      totalPrice += 600;
    }

    //calculate meal
    if ( mMeal.equalsIgnoreCase("light snacks")) {
      totalPrice += (3 * getGuests());
    } else if ( mMeal.equalsIgnoreCase("Steak and Potatoes")) {
      totalPrice += (6 * getGuests());
    } else if ( mMeal.equalsIgnoreCase("Seafood Platter")) {
      totalPrice += (8 * getGuests());
    } else if ( mMeal.equalsIgnoreCase("none")) {
        // do nothing
    }

    //calculate drinks
    if ( mDrinks.equalsIgnoreCase("sodas")) {
      totalPrice += (2 * getGuests());
    } else if ( mDrinks.equalsIgnoreCase("limited bar")) {
      totalPrice += (4 * getGuests());
    } else if ( mDrinks.equalsIgnoreCase("full bar")) {
      totalPrice += (10 * getGuests());
    } else if ( mDrinks.equalsIgnoreCase("none")) {
        // do nothing
    }



    return totalPrice.toString();

    // 100-150
    // 75-100
    // 50-75
    // 25-50
    // under 25
  }
}
