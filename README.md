# LeetCode

A personal collection of 130+ data structure & algorithm problems solved in Java, organized by topic and built with Gradle. Some solutions are backed by [Spock](https://spockframework.org/) tests.

## Requirements

- JDK 21 ([Temurin](https://adoptium.net/) recommended)

No local Gradle install is needed — this repo ships the Gradle Wrapper, which downloads the correct Gradle version automatically on first run.

## Getting started

```bash
git clone https://github.com/rahuldebug/LeetCode.git
cd LeetCode

# Compile everything
./gradlew build

# Run the test suite
./gradlew test
```

There's no single CLI entry point — each solution is a standalone class under `app/src/main/java`. Open the class you want in your IDE and run its `main` method (where present), or add a quick Spock spec under `app/src/test/groovy` to exercise it.

## Project layout

```
app/
├── src/main/java/com/leetcode/   # solutions, grouped by topic
└── src/test/groovy/com/leetcode/ # Spock specs
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
3. Optionally add a Spock spec under `app/src/test/groovy/com/leetcode/<topic>/` and run `./gradlew test`.
