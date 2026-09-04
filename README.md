# LeetCode

A personal collection of 130+ data structure & algorithm problems solved in Java, organized by topic. No build tool — just plain `.java` files.

## Requirements

- JDK 21 ([Temurin](https://adoptium.net/) recommended)

## Getting started

```bash
git clone https://github.com/rahuldebug/LeetCode.git
cd LeetCode

# Compile a single solution (and anything it depends on in the same package)
javac -d app/bin/main app/src/main/java/com/leetcode/<topic>/<Solution>.java

# Run it (if it has a main method)
java -cp app/bin/main com.leetcode.<topic>.<Solution>
```

There's no single CLI entry point — each solution is a standalone class under `app/src/main/java`. Open the class you want in your IDE (VSCode's Java extension picks up `app/src/main/java` automatically) and run its `main` method where present.

## Project layout

```
app/
└── src/main/java/com/leetcode/   # solutions, grouped by topic
```

| Package | Topic |
|---|---|
| `arrays` (+ `twopointer`, `slidingwindow`) | Arrays, two-pointer, sliding window |
| `binarysearch` | Binary search |
| `bitwiseoperator` | Bit manipulation |
| `hashing` | Hash maps / sets |
| `heap` | Heaps & priority queues |
| `linkedlist` (+ `impl`) | Linked lists |
| `matrix` | 2D matrices / grids |
| `recursion` | Recursion |
| `sortingsearching` | Sorting & searching |
| `stackqueue` | Stacks & queues |
| `string` | Strings |
| `tree` | Binary trees |

## Adding a new solution

1. Drop a new class into the matching topic package under `app/src/main/java/com/leetcode/<topic>/`.
2. Name it after the problem (e.g. `MaxSubArray.java`), and note the LeetCode problem number in a comment or in the commit message.
