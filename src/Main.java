import java.util.List;

public class Main {
    public static void main(String[] args) {
        Battery battery = new Battery(1000);

        // Create multiple energy sources with different charge rates and priorities
        EnergySource source1 = new EnergySource(battery, 30, 2);
        EnergySource source2 = new EnergySource(battery, 20, 1);

        // Create multiple energy consumers with different usage rates
        EnergyConsumer consumer1 = new EnergyConsumer(battery, 10);
        EnergyConsumer consumer2 = new EnergyConsumer(battery, 5);

        // Create threads for each source and consumer
        Thread sourceThread1 = new Thread(source1);
        Thread sourceThread2 = new Thread(source2);
        Thread consumerThread1 = new Thread(consumer1);
        Thread consumerThread2 = new Thread(consumer2);

        // Start all threads
        sourceThread1.start();
        sourceThread2.start();
        consumerThread1.start();
        consumerThread2.start();

        // Monitor the system
        SystemController controller = new SystemController(List.of(consumer1, consumer2), 200);
        new Thread(() -> controller.monitorSystem(battery)).start();
    }
}
