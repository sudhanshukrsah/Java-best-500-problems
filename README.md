# 500 Curated Core Java Problems — Your One‑Stop Path to Mastery

Crack Java interviews and build rock‑solid fundamentals with this topic‑wise set of 500 Core‑Java problems. The list balances breadth and depth across syntax, algorithms, data structures, OOP, collections, I/O, and modern Java concurrency and streams. Each problem comes with a difficulty tag and a one‑line hint to nudge you in the right direction—ideal for daily practice, quick revision, and interview prep.

Why this set works:
- Coverage that matches real interview signals: basics → data structures → design → concurrency → Java 8+.
- Progressive difficulty with micro‑hints, so you learn by doing without getting stuck.
- Topic‑wise grouping for focused sprints or end‑to‑end revision in a few weeks.
- Practical patterns (LRU, rate limiter, trie, schedulers, caches) to bridge CS concepts and real‑world Java.

How to use:
- Start at your current level, then sweep section‑wise. Track time and space complexity as you solve.
- Implement from scratch first, then refactor to idiomatic Java (Collections, Streams, Optional, records where relevant).
- For Medium/Hard, write tests and reason about edge cases, concurrency, and performance.

Legend: (E) Easy • (M) Medium • (H) Hard — Each item includes a short hint.

---

## A. Basics, Syntax, Data Types, Operators, Flow (1–100)

1. Print "Hello World" in Java. (E) — basic class & main signature.
2. Swap two numbers without third variable. (E) — use arithmetic or XOR.
3. Check whether a number is prime. (E) — sqrt optimization.
4. Find factorial of n (iterative & recursive). (E) — recursion base case.
5. Fibonacci series (iterative & recursive & DP). (E)
6. Reverse a number (e.g., 1234 → 4321). (E)
7. Check Armstrong number. (M)
8. Count digits of a number without string conversion. (E)
9. Check palindrome number. (E)
10. GCD and LCM of two numbers. (M) — Euclid's algorithm.
11. Convert binary to decimal and vice versa. (M)
12. Find sum of digits of a number (recursive). (E)
13. Power of a number (fast exponentiation). (M)
14. Check if two numbers are anagrams of digits. (M)
15. Find largest and smallest in an array. (E)
16. Remove duplicates from unsorted array (in-place). (M)
17. Rotate array by k positions (left/right). (M)
18. Move zeros to end of array maintaining order. (E)
19. Find second largest element in array. (E)
20. Merge two sorted arrays into sorted array. (M)
21. Count occurrences of each element in array (using Map). (E)
22. Detect overflow in integer addition/multiplication. (H) — use long/BigInteger or check signs.
23. Check power of two. (E)
24. Implement binary search (iterative & recursive). (E)
25. Find first non-repeating element in array. (M)
26. Implement naive & improved substring search. (M)
27. Check number of set bits in integer (Brian Kernighan). (M)
28. Swap two variables using bitwise XOR. (E)
29. Check if array is sorted (ascending/descending). (E)
30. Sum of all elements in array using streams. (E)
31. Find maximum subarray sum (Kadane’s algorithm). (M)
32. Implement prefix sum array & queries. (M)
33. Count pairs with given sum in array (hashing). (M)
34. Intersection of two arrays (with duplicates & without). (M)
35. Union of two arrays. (E)
36. Partition array around pivot (like quicksort partition). (M)
37. Implement sieve of Eratosthenes (primes up to n). (M)
38. Print Pascal triangle up to n rows. (M)
39. Convert infix to postfix expression. (H) — use stack.
40. Evaluate postfix expression. (M)
41. Implement simple calculator supporting +,-,*,/. (M)
42. Validate parentheses sequence (balanced brackets). (E)
43. Convert decimal to roman numerals (and back). (H)
44. Implement simple command-line argument parser. (E)
45. Count vowels and consonants in a string. (E)
46. Implement random shuffling of array (Fisher–Yates). (M)
47. Check if two strings are rotations of each other. (M) — use concatenation trick.
48. Convert string to integer (implement parseInt). (M)
49. Atoi with overflow handling. (M)
50. Count trailing zeros in n! (Legendre’s formula). (H)
51. Compute nCr efficiently for large n (modular or big numbers). (H)
52. Implement simple memoized recursion pattern. (E)
53. Replace spaces in a string with %20. (E)
54. Remove duplicates from linked list array representation. (M)
55. Check if number is perfect number. (M)
56. Generate next lexicographic permutation. (H)
57. Compare two floating numbers within epsilon. (E)
58. Implement fixed-size circular buffer. (M)
59. Implement stack using two queues. (M)
60. Implement queue using two stacks. (M)
61. Balanced partition problem (subset sum equal partition). (H)
62. Power set (all subsets) generation. (M)
63. Count ways to climb stairs (DP). (E)
64. Implement LRU cache (using LinkedHashMap or custom). (H)
65. Implement simple rate limiter (token bucket). (H)
66. Implement event scheduler (timers). (M)
67. Design class for complex number operations. (E)
68. Implement matrix multiplication (naive & Strassen). (H)
69. Transpose a matrix in-place. (M)
70. Spiral traversal of matrix. (M)
71. Print matrix diagonally. (M)
72. Rotate matrix by 90 degrees. (M)
73. Saddle point in matrix. (M)
74. Matrix chain multiplication (DP). (H)
75. Word wrap / text justification. (H)
76. Longest increasing subsequence (LIS) n log n solution. (H)
77. Longest common subsequence (LCS) DP. (H)
78. Longest common substring. (H)
79. Edit distance (Levenshtein). (H)
80. Implement basic regex matching (limited). (H)
81. Implement Trie for prefix search. (H)
82. Autocomplete using Trie. (H)
83. Find median of two sorted arrays. (H)
84. Sliding window maximum. (H)
85. Minimum window substring. (H)
86. Implement reservoir sampling. (H)
87. Merge k sorted arrays (heap). (H)
88. Find k-th largest element (quickselect). (M)
89. Find missing number in 1..n with XOR. (E)
90. Find duplicate in array with one duplicate. (M)
91. Find cycle in a sequence (Floyd’s). (M)
92. Implement heap (min & max) from scratch. (H)
93. Implement priority queue with custom comparator. (M)
94. Scheduling problem: interval scheduling maximum non-overlapping. (M)
95. Meeting room allocation (min rooms). (M)
96. Smallest subarray with sum greater than x. (M)
97. Majority element (Boyer–Moore). (M)
98. Find repeating & missing number in array. (M)
99. Maximum product subarray. (M)
100. Count inversions in array (merge sort). (H)

---

## B. Strings & Character Handling (101–170) — 70 questions

101. Reverse a string (two-pointer). (E)
102. Reverse words in a sentence. (E)
103. Check palindrome string ignoring non-alphanumerics. (M)
104. Anagram check (sort vs frequency). (E)
105. Group anagrams from list of strings. (M)
106. Longest palindrome substring (expand around center / Manacher). (H)
107. Longest palindromic subsequence. (H)
108. Count substrings with same start and end. (M)
109. Minimum insertions to make palindrome. (H)
110. Check if string is rotation using KMP. (H)
111. Encode/decode run-length encoding. (E)
112. Implement strstr (KMP). (H)
113. Wildcard pattern matching (DP). (H)
114. Word break (DP + dictionary). (M)
115. Replace duplicate characters with next available. (M)
116. Find common prefix in array of strings. (E)
117. Longest common prefix (divide & conquer). (M)
118. Compress string (counts). (E)
119. Minimum window substring containing all chars of pattern. (H)
120. Convert to title case. (E)
121. Reverse words in place (char array). (M)
122. Count occurrences of substring overlaps. (M)
123. Check if two strings differ by one edit. (M)
124. Zigzag conversion of string. (M)
125. Implement Rabin-Karp rolling hash. (H)
126. Find longest substring without repeating characters. (M)
127. Reorder string by frequency (heap). (M)
128. Convert number to words (e.g., 123 → "one two three"). (M)
129. Find all palindromic pairs in list. (H)
130. Generate all permutations of string (with duplicates). (H)
131. Validate IPv4/IPv6 addresses. (M)
132. Restore IP addresses from string. (H)
133. Minimum cuts for palindrome partitioning. (H)
134. Shortest common supersequence. (H)
135. Perform basic HTML tag stripping. (M)
136. Convert camelCase to snake_case. (E)
137. Check valid parentheses with characters in-between. (M)
138. Longest substring with at most k distinct chars. (H)
139. Reformat string (like license key formatting). (E)
140. Entropy-based string tasks (count distribution). (H)
141. String interleaving check (DP). (H)
142. Shortest palindrome by adding chars in front. (H)
143. Minimum window subsequence. (H)
144. Find repeated DNA sequences. (M)
145. Replace words with shortest root (trie). (H)
146. Encode/decode base64 (implement). (H)
147. Implement custom string builder class. (M)
148. Find longest substring where each char appears >= k times. (H)
149. Longest duplicate substring (suffix array). (H)
150. Implement suffix trie/array basics. (H)
151–170: (20 more string pattern & parsing problems — anagrams, palindromic partitions, advanced pattern matching, parsing CSV, etc.) — mixed E/M/H.

---

## C. OOPs Deep (171–270) — 100 questions

171. Explain class vs object, show example. (E)
172. Implement immutable class (like String). (M)
173. Difference between equals() and == (with example). (E)
174. Override hashCode() with equals(). (M)
175. Implement Comparable vs Comparator. (E)
176. Demonstrate method overloading vs overriding. (E)
177. Abstract class vs interface. (E)
178. Functional interface example. (E)
179. Implement Builder pattern for object creation. (M)
180. Singleton pattern (eager, lazy, thread-safe). (M)
181. Factory method pattern. (M)
182. Adapter pattern example. (M)
183. Decorator pattern example. (H)
184. Prototype pattern cloning. (M)
185. Command pattern basics. (H)
186. Observer pattern implementation (listener). (M)
187. Strategy pattern for sorting strategy. (M)
188. Explain Liskov Substitution Principle with example. (M)
189. Use of final keyword in classes/methods/variables. (E)
190. Implement equals for inheritance-safe behavior. (H)
191. Compare static vs instance initialization blocks. (E)
192. Use of transient keyword and Serialization. (M)
193. Write a class with custom serialization (readObject/writeObject). (H)
194. Demonstrate composition vs inheritance. (E)
195. Explain covariance and contravariance in Java. (H)
196. Implement callback using interfaces. (M)
197. Create proxy pattern using dynamic proxies. (H)
198. Implement deep copy vs shallow copy. (M)
199. Implement clone() properly with Cloneable. (H)
200. Method reference usage and examples. (M)
201. Default & static methods in interfaces. (M)
202. Diamond problem and Java solution. (M)
203. Write a class hierarchy modeling shapes with area() abstract. (E)
204. Design a simple bank account class with transactions. (M)
205. Implement access modifiers example and package behavior. (E)
206. Implement custom Iterator for a collection. (H)
207. Design a parking lot (OOP design). (H)
208. Implement event bus with subscribers. (H)
209. Explain and implement POJO vs JavaBean. (E)
210. Implement multiple constructors & constructor chaining. (E)
211–270: (more OOP design patterns, SOLID-focused questions, design-case problems, real-world modelling, and tricky equality/immutability/serialization cases).

---

## D. Exceptions, I/O, File Handling, Serialization (271–320) — 50 questions

271. Checked vs unchecked exceptions with examples. (E)
272. Create custom exception and throw it. (E)
273. Try-with-resources usage & AutoCloseable. (M)
274. Read file line-by-line (BufferedReader). (E)
275. Write to file (BufferedWriter/FileOutputStream). (E)
276. Read large file without OOM (streaming). (M)
277. Serialize & deserialize an object (Serializable). (M)
278. Transient fields & serialization. (M)
279. Externalizable interface example. (H)
280. Copy file efficiently (NIO channels). (M)
281. File watching (WatchService API). (H)
282. Read/write JSON using library (Jackson/Gson) — concept. (M)
283. Implement CSV parser (edge cases, quotes). (H)
284. Handle file locking & concurrency. (H)
285. Implement rolling log writer. (H)
286. RandomAccessFile usage. (M)
287. Memory-mapped file usage (NIO). (H)
288. Implement basic object pool with filehandles. (H)
289. Custom exception chaining & suppressed exceptions. (M)
290. Stack trace parsing & custom logger. (M)
291–320: (more real-world I/O/serialization/stream handling tasks)

---

## E. Collections Framework (321–420) — 100 questions

321. Difference between ArrayList and LinkedList. (E)
322. When to use HashMap vs TreeMap vs LinkedHashMap. (M)
323. Implement custom HashMap (simplified). (H)
324. Fail-fast vs fail-safe iterators. (M)
325. ConcurrentHashMap behavior basics. (M)
326. How HashMap works internally (buckets, hashing, resize). (H)
327. Implement LRU cache using LinkedHashMap (accessOrder). (M)
328. Difference between HashSet and TreeSet. (E)
329. PriorityQueue internals & custom comparator. (M)
330. BlockingQueue examples (ArrayBlockingQueue, LinkedBlockingQueue). (M)
331. Implement a thread-safe list (CopyOnWriteArrayList). (M)
332. Collections.synchronizedList usage & caveats. (M)
333. Map.computeIfAbsent example. (M)
334. MultiMap implementation patterns. (H)
335. Counting frequency using Map.merge(). (E)
336. Use of EnumMap. (E)
337. Implement custom iterator with remove support. (H)
338. Sorting collections with Comparator and thenComparing. (M)
339. Partitioning using streams + collectors. (M)
340. GroupingBy example with multi-level grouping. (H)
341–420: (more hashmap/set/list/queue/deque/stack/collection-algorithms, performance tuning, memory footprint, custom collection impls)

---

## F. Multithreading, Concurrency & Java 8+ (421–520) — 80 questions

### F1. Multithreading & Concurrency (421–470) — 50 questions

421. Create thread by extending Thread and by implementing Runnable. (E)
422. Difference between Runnable and Callable (Future). (E)
423. Thread lifecycle & states. (E)
424. Synchronization basics — synchronized keyword & intrinsic locks. (M)
425. Deadlock example and how to avoid. (M)
426. Volatile keyword and memory visibility. (M)
427. Wait/notify/notifyAll usage. (H)
428. Producer-consumer problem (wait/notify). (M)
429. Implement producer-consumer with BlockingQueue. (M)
430. ThreadPoolExecutor basics and custom config. (M)
431. CompletableFuture usage & chaining. (M)
432. Phaser/CyclicBarrier/CountDownLatch usage. (M)
433. ReentrantLock vs synchronized. (M)
434. ReadWriteLock example. (M)
435. AtomicInteger/AtomicReference usage. (M)
436. StampedLock basics. (H)
437. ThreadLocal usage & memory leak caution. (M)
438. Implement ForkJoin task for parallel sum. (H)
439. Implement custom thread factory. (M)
440. Scheduling tasks with ScheduledExecutorService. (M)
441. Detect & recover from thread starvation. (H)
442. Design concurrent cache with eviction and concurrency. (H)
443. Implement a race condition example and fix it. (E)
444–470: (more concurrency exercises: safe publication, happens-before, visibility rules, lock striping, designing concurrent data structures)

### F2. Java 8+ Features (471–500) — 30 questions

471. Lambda expression basics & syntax. (E)
472. Functional interfaces and @FunctionalInterface. (E)
473. Method references (static, instance, constructor). (M)
474. Stream API: filter, map, reduce example. (E)
475. Stream collectors: toList, toSet, joining, groupingBy. (M)
476. Optional usage & pitfalls. (M)
477. Parallel streams vs CompletableFuture tradeoffs. (M)
478. Default & static methods in interfaces (use-case). (M)
479. Date-Time API (java.time) usage, LocalDate, LocalDateTime. (M)
480. ZoneDateTime and timezones conversions. (M)
481. Formatting/parsing dates. (E)
482. Use of IntStream, LongStream, DoubleStream. (E)
483. Stream pipelines & short-circuit ops. (M)
484. Custom collector implementation. (H)
485. Using streams to solve top-K problems. (M)
486. Use CompletableFuture.supplyAsync with executor. (M)
487–500: (more Java 9+ modularity, var (local variable type inference in later Java), records, sealed classes, pattern matching basics, enhancements — mixed E/M/H)

---

## Tips for Success
- Solve, then compare with multiple approaches: iterative, recursive, DP, greedy, divide-and-conquer.
- Track time/space. Push for O(n), O(log n) where possible.
- For concurrency, write small demos to visualize races and correctness.
- Prefer immutable data and pure functions when possible; isolate side effects.

## Contributing
- PRs welcome: add solutions, tests, or clarifications. Keep problems atomic and hints concise.

## License
- Educational use. If adapting, please include attribution to this repository.
