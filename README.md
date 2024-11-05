# Energy Management System

Video file:
https://drive.google.com/file/d/1p88Dfdef3DFrvMlR0AeW9qRuBGgq0Soy/view?usp=sharing

## Team Members
- **Sarvar Abdurakhimov** (7221535) - Implemented the `Battery` class, `SystemController` monitoring, and documentation of concurrency theory. Developed `EnergySource` and `EnergyConsumer` classes, focusing on concurrent charging and usage simulation.
- **Komiljon Yangiboev** (7222441)


<img width="604" alt="Screenshot 2024-11-05 at 22 52 06" src="https://github.com/user-attachments/assets/2c581f3f-88fd-4ce7-bf65-5524205fb9e2">



## Project Structure
Component Overview Battery.java Manages the battery's charge and capacity. Provides synchronized charge and drain methods to prevent concurrent modification issues.

EnergySource.java Simulates an energy source that charges the battery at a configurable rate and priority. Each energy source runs on a separate thread.

EnergyConsumer.java Represents a consumer that drains energy from the battery at a set usage rate. Each consumer operates on its own thread.

SystemController.java Monitors the battery's charge level. Issues warnings if the battery is critically low and can control or adjust the load if necessary to prevent overload.

<img width="279" alt="Screenshot 2024-11-05 at 22 52 29" src="https://github.com/user-attachments/assets/b883a199-40ae-40f2-b508-b27126d3442c">
