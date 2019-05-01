package algorithm.sorting;

/**
 * Sorting algo perfromance  depends on
 * Compression
 * Exchange
 * Number of time array access for read and write
 * Number of compression and Exchange is easy to visualize in the N-by-N diagram.
 *
 *   * This statement has been validated on many different computers over
 *   * the past half-century. Insertion sort was about twice as fast as selection sort when
 *   * the first edition of this book was written in 1980 and it still is today, even though it
 *   * took several hours to sort 100,000 items with these algorithms then and just several
 *   * seconds today. ( page 255)
 *
 *
 * Shellsort To exhibit the value of knowing properties of elementary sorts, we next
 * consider a fast algorithm based on insertion sort. Insertion sort is slow for large un-
 * ordered arrays because the only exchanges it does involve adjacent entries, so items
 * can move through the array only one place at a time. For example, if the item with the
 * smallest key happens to be at the end of the array, N-1 exchanges are needed to get that
 * one item where it belongs. Shellsort is a simple extension of insertion sort that gains
 * speed by allowing exchanges of array entries that are far apart, to produce partially
 * sorted arrays that can be efficiently sorted, eventually by insertion sort.
 *
 *
 */


/**
 * Shell-sort
 *
 * How do we decide what increment sequence to use? In general, this question is a dif-
 * ficult one to answer. The performance of the algorithm depends not just on the num-
 * ber of increments, but also on arithmetical interactions among the increments such as
 * size of their common divisors and other properties.
 *
 *
 * The most important result in the present context is the knowledge that the running time of shellsort
 * is not necessarily quadratic—for example, it is known that the worst-case number of
 * compares for Algorithm 2.3 is proportional to N 3/2 .That such a simple modification
 * can break the quadratic-running-time barrier is quite interesting, as doing so is a prime
 * goal for many algorithm design problems.
 *
 */
