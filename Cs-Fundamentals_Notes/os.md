# Starvation

Starvation means a process waits for a very long time (possibly forever) because other processes keep getting the resources/CPU before it.

Solns:---->
Aging:- Aging gradually increases the priority of a waiting process.

# Starvation vs Deadlock

Starvation:

Process is waiting because it keeps losing resource/CPU allocation.

Deadlock:

Processes are waiting for each other and none can proceed.

# Paging

Paging is a memory-management technique where:

Logical/virtual memory → divided into pages
Physical memory/RAM → divided into frames

# SJF — Shortest Job First

SJF is a CPU scheduling algorithm.

The process having the smallest burst time gets executed first.

# SJF vs SRTF

SJF:--->

Non-preemptive

Once a process starts, it continues until completion.

P1 starts
↓
P1 finishes
↓
Next process

SRTF:---->

Preemptive version of SJF

SRTF = Shortest Remaining Time First

If a new process arrives whose remaining time is smaller, the current process can be stopped.

# Top 20 OS Interview Questions

If you have limited time, prepare these first:

What is an Operating System?
Process vs Thread?
What is a PCB?
What are the different process states?
What is context switching?
What is CPU scheduling?
FCFS vs SJF vs Round Robin?
SJF vs SRTF?
What is starvation? How is it solved?
What is deadlock?
What are the four conditions for deadlock?
Deadlock vs Starvation?
What is a race condition?
Mutex vs Semaphore?
What is a critical section?
What is paging?
Paging vs Segmentation?
What is a page fault?
What is virtual memory?
FIFO vs LRU vs Optimal page replacement?

# 1

Multithreading
Context switching
PCB
Process states

# CPU Scheduling

FCFS
SJF
SRTF
Priority Scheduling
Round Robin
Multilevel Queue
Multilevel Feedback Queue

# deadlock

Know the 4 necessary conditions:

Mutual Exclusion
No Preemption
Hold and Wait
Circular Wait

Remember:

M N H C

Also learn:

Deadlock prevention
Deadlock avoidance
Deadlock detection
Banker's Algorithm
Deadlock vs Starvation

# Synchronization

Race Condition
Critical Section
Mutex
Semaphore
Monitor
Producer-Consumer Problem
Reader-Writer Problem
Dining Philosophers

What is a race condition?

When multiple threads/processes access shared data simultaneously and the final result depends on the order of execution.

# Memory Management ⭐⭐⭐⭐⭐

Paging
Segmentation
Virtual Memory
Page Table
TLB
Page Fault
Demand Paging
Fragmentation

Internal Fragmentation
vs
External Fragmentation

# Page Replacement Algorithms ⭐⭐⭐⭐⭐

Very important for OS exams/interviews.

Learn:

FIFO
LRU
Optimal
Second Chance / Clock

# Virtual Memory

Virtual memory
Page fault
Demand paging
TLB
Thrashing

# Fragmentation

Internal fragmentation:--->
Memory allocated > memory actually needed.

Allocated = 10 KB
Used = 7 KB

Waste = 3 KB

External fragmentation:------> Enough total free memory exists, but it is scattered into small blocks.

Free: 2 KB | Process | 3 KB | Process | 4 KB

Total free = 9 KB, but a 7 KB contiguous block may not exist.
