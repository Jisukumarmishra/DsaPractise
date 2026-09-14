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
