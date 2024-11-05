import java.util.List;

public class SystemController {
    private final List<EnergyConsumer> consumers;
    private final double overloadThreshold;

    public SystemController(List<EnergyConsumer> consumers, double overloadThreshold) {
        this.consumers = consumers;
        this.overloadThreshold = overloadThreshold;
    }

    public void monitorSystem(Battery battery) {
        while (true) {
            if (battery.getChargeLevel() < overloadThreshold) {
                System.out.println("Warning: System overload risk. Reducing load...");
                
                // Example: Interrupt or pause low-priority consumers to reduce load
                for (EnergyConsumer consumer : consumers) {
                    // In a real system, you might pause or reduce the rate of specific consumers
                    // Here, we simulate it with a message
                    System.out.println("Pausing consumer with usage rate: " + consumer.getUsageRate());
                    // You can choose to interrupt the thread if needed, though this is a placeholder for demonstration
                    // Thread.currentThread().interrupt();
                }
            }

            try {
                Thread.sleep(1000); // Check every second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("System monitor interrupted");
            }
        }
    }
}
