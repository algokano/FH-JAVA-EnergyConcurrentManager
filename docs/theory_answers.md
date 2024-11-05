# Theory Answers

## Comparison of Concurrency Models: Pros and Cons

Concurrency models help us manage multiple tasks at once. The two main models are **Shared Memory** and **Message Passing**.

### Shared Memory Model
In this model, threads share the same memory and communicate by reading/writing shared variables.

- **Pros**:
  - **Fast Communication**: Accessing shared data directly is quicker.
  - **Simplicity**: Threads can directly see each other's changes.
  
- **Cons**:
  - **Risk of Conflicts**: Threads might interfere with each other’s data, needing locks to keep things safe.
  - **Hard to Debug**: Problems like deadlocks (where threads wait forever) can be tough to fix.

### Message Passing Model
Here, each thread has its own memory, and they communicate by sending messages to each other.

- **Pros**:
  - **Better Isolation**: Threads don’t mess with each other’s memory, so there are fewer conflicts.
  - **Good for Distributed Systems**: Works well across networks where each part is separate.
  
- **Cons**:
  - **Slower Communication**: Sending messages can add some delay.
  - **More Complex**: Managing message-based communication can take extra planning.

**Summary**: Use shared memory for quick, tightly connected tasks. Message passing is better when parts of the program are more independent or distributed.

---

## Concurrency vs. Parallelism

### Concurrency
- **Definition**: Concurrency is when multiple tasks progress at the same time, but not necessarily all running at once.
- **Example**: Imagine an OS handling multiple apps (browser, editor). It quickly switches between them, giving the appearance that they’re all working simultaneously.
- **Goal**: Concurrency aims to keep everything responsive and active, even if only one thing happens at a time.

### Parallelism
- **Definition**: Parallelism is when tasks actually run at the same time on multiple cores or processors.
- **Example**: Processing multiple files or calculations at once on a multi-core CPU.
- **Goal**: Parallelism’s main aim is speed – to finish tasks faster by running them side-by-side.

**Key Difference**: Concurrency is about juggling tasks to keep the program responsive, while parallelism is about speeding things up by doing multiple tasks at the same time.

---

## Blocking vs. Non-blocking Concurrency Algorithms

### Blocking Concurrency Algorithms
Blocking algorithms make a thread wait until it’s safe to access shared data. This usually means using locks.

- **Example**: In Java, synchronized methods make threads wait for a lock before accessing a resource.
- **When to Use**: Blocking is helpful when we need to strictly control data access so that only one thread modifies it at a time.
- **Pros**:
  - **Data Safety**: Ensures that only one thread can access shared data at a time, avoiding conflicts.
  - **Simple to Understand**: It’s easy to see which thread is accessing data because others are blocked.
- **Cons**:
  - **Slower Performance**: Threads might wait a lot, which slows things down.
  - **Risk of Deadlocks**: If threads hold onto locks and wait for others, the program can freeze.

### Non-blocking Concurrency Algorithms
Non-blocking algorithms let threads attempt to do work without waiting, even if the resource is busy. These use atomic operations instead of locks.

- **Example**: Java’s `AtomicInteger` allows threads to update a number without locks.
- **When to Use**: Non-blocking is great for high-speed applications where threads can’t afford to wait.
- **Pros**:
  - **Better Performance**: Threads can keep moving without getting stuck waiting.
  - **Avoids Deadlocks**: Since threads don’t wait for locks, the risk of deadlocks is lower.
- **Cons**:
  - **Complex to Write**: These algorithms can be tricky to design and understand.
  - **Harder to Manage**: Non-blocking code can be more confusing, especially in complex programs.
