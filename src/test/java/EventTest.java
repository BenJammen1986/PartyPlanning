import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest {

  @Test
  public void event_objectInstantiatesCorrectly() {
    Event newEvent = new Event("Something", 100, "Food", "Coke");
    assertEquals(true, newEvent instanceof Event);
  }

  @Test
  public void event_instantiatesCorrectlyWithName() {
    Event newEvent = new Event("Something", 100, "Food", "Coke");
    assertEquals("Something", newEvent.getName());
  }

  @Test
  public void event_getsGuestsCorrectly() {
    Event newEvent = new Event("Something", 100, "Food", "Coke");
    assertEquals(100, newEvent.getGuests().intValue());
  }

  @Test
  public void event_getsMealCorectly() {
    Event newEvent = new Event("Something", 100, "Food", "Coke");
    assertEquals("Food", newEvent.getMeal());
  }

  @Test
  public void event_getsDrinksCorrectly() {
    Event newEvent = new Event("Something", 100, "Food", "Coke");
    assertEquals("Coke", newEvent.getDrinks());
  }





}



// Identify the simplest behavior and work from there:
