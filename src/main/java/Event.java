

public class Event {
  private String mName;
  private Integer mGuests;
  private String mMeal;
  private String mDrinks;


    public Event(String name, Integer guests, String meal, String drinks) {
      mName = name;
      mGuests = guests;
      mMeal = meal;
      mDrinks = drinks;
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

  public String calculatePrice() {

  }
}
