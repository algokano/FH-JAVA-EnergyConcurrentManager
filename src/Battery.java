public class Battery {
    private double chargeLevel;
    private final double capacity;

    public Battery(double capacity) {
        this.capacity = capacity;
        this.chargeLevel = 0;
    }

    public synchronized void charge(double amount) {
        if (chargeLevel + amount > capacity) {
            chargeLevel = capacity;
        } else {
            chargeLevel += amount;
        }
        System.out.println("Battery charged to: " + chargeLevel + " at " + System.currentTimeMillis());
    }

    public synchronized void drain(double amount) throws Exception {
        if (chargeLevel < amount) {
            throw new Exception("Battery level too low to drain " + amount);
        } else {
            chargeLevel -= amount;
            System.out.println("Battery drained to: " + chargeLevel + " at " + System.currentTimeMillis());
        }
    }

    public double getChargeLevel() {
        return chargeLevel;
    }
}
