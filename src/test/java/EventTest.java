import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest {

  @Test
  public void event_objectInstantiatesCorrectly() {
    Event newEvent = new Event("Something", 100, "Food", "Coke", "DJ", "drinks1234");
    assertEquals(true, newEvent instanceof Event);
  }

  @Test
  public void event_instantiatesCorrectlyWithName() {
    Event newEvent = new Event("Something", 100, "Food", "Coke", "DJ", "drinks1234");
    assertEquals("Something", newEvent.getName());
  }

  @Test
  public void event_getsGuestsCorrectly() {
    Event newEvent = new Event("Something", 100, "Food", "Coke", "DJ", "drinks1234");
    assertEquals(100, newEvent.getGuests().intValue());
  }

  @Test
  public void event_getsMealCorectly() {
    Event newEvent = new Event("Something", 100, "Food", "Coke", "DJ", "drinks1234");
    assertEquals("Food", newEvent.getMeal());
  }

  @Test
  public void event_getsDrinksCorrectly() {
    Event newEvent = new Event("Something", 100, "Food", "Coke", "DJ", "drinks1234");
    assertEquals("Coke", newEvent.getDrinks());
  }

  @Test
  public void event_getsEntertainmentCorrectly() {
    Event newEvent = new Event("Something", 100, "Food", "Coke", "DJ", "drinks1234");
    assertEquals("DJ", newEvent.getEntertainment());
  }

  @Test
  public void event_getsCouponCodeCorrectly() {
    Event newEvent = new Event("Something", 100, "Food", "Coke", "DJ", "drinks1234");
    assertEquals("drinks1234", newEvent.getCoupon());
  }




}



// Identify the simplest behavior and work from there:
