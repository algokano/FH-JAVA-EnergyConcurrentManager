public class EnergySource implements Runnable {
    private final Battery battery;
    private final double chargeRate;
    private final int priority;

    public EnergySource(Battery battery, double chargeRate, int priority) {
        this.battery = battery;
        this.chargeRate = chargeRate;
        this.priority = priority;
    }

    @Override
    public void run() {
        while (true) {
            try {
                battery.charge(chargeRate * priority);
                Thread.sleep(1000 / priority);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Energy source interrupted");
            }
        }
    }
}
