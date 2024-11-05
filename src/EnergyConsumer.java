public class EnergyConsumer implements Runnable {
    private final Battery battery;
    private final double usageRate;

    public EnergyConsumer(Battery battery, double usageRate) {
        this.battery = battery;
        this.usageRate = usageRate;
    }

    @Override
    public void run() {
        while (true) {
            try {
                battery.drain(usageRate);
                Thread.sleep(500);  // Simulate different loads
            } catch (Exception e) {
                System.out.println("Battery drain failed: " + e.getMessage());
            }
        }
    }

    // Add the getUsageRate method to retrieve the usage rate
    public double getUsageRate() {
        return usageRate;
    }
}
