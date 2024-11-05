Energy Management System

Team Members
Sarvar Abdurakhimov (7221535) - Implemented the Battery class, SystemController monitoring, and documentation of concurrency theory. Developed EnergySource and EnergyConsumer classes, focusing on concurrent charging and usage simulation.
Komiljon Yangiboev (7222441)

Assignment Objectives
Concurrent Charging: Simulate multithreaded charging of a battery by multiple energy sources.
Concurrent Usage: Simulate multithreaded battery usage by multiple consumers.
Overload Control: Implement a monitoring system to prevent battery overload.
Concurrency Theory: Answer theoretical questions related to concurrency.

Project Structure

EnergyConcurrentManager/
├── src/
│   ├── Battery.java           # Battery management with charge and drain functions
│   ├── EnergySource.java       # Energy sources to charge the battery concurrently
│   ├── EnergyConsumer.java     # Energy consumers to drain the battery concurrently
│   └── SystemController.java   # System controller to monitor battery levels and prevent overload
├── tests/
│   └── BatteryTest.java        # Sample unit test for battery functionality
├── docs/
│   └── theory_answers.md       # Answers to concurrency theory questions
├── Main.java                   # Main file to run the simulation
└── README.md                   # Project documentation

Component Overview
Battery.java
Manages the battery's charge and capacity. Provides synchronized charge and drain methods to prevent concurrent modification issues.

EnergySource.java
Simulates an energy source that charges the battery at a configurable rate and priority. Each energy source runs on a separate thread.

EnergyConsumer.java
Represents a consumer that drains energy from the battery at a set usage rate. Each consumer operates on its own thread.

SystemController.java
Monitors the battery's charge level. Issues warnings if the battery is critically low and can control or adjust the load if necessary to prevent overload.
