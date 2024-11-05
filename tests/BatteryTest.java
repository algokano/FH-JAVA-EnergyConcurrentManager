import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BatteryTest {
   @Test
   public void testCharge() {
       Battery battery = new Battery(100);
       battery.charge(50);
       assertEquals(50, battery.getChargeLevel(), "Charge level should be 50");
   }

   @Test
   public void testDrain() {
       Battery battery = new Battery(100);
       battery.charge(50);
       try {
           battery.drain(20);
           assertEquals(30, battery.getChargeLevel(), "Charge level should be 30 after draining");
       } catch (Exception e) {
           fail("Drain method threw an unexpected exception");
       }
   }
}
