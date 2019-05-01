package algorithm.sorting


/**
  *
  *
  * Sort
  * Unlike that of selection sort, the running time of insertion sort depends on the initial order
  * of the items in the input.For example, if the array is large and its entries are
  * already in order (or nearly in order), then insertion sort is much, much faster than if
  * the entries are randomly ordered or in reverse order.
  *
  * Insertion sort uses N^2/4 compares and N^2 /4 exchanges to sort
  * a randomly ordered array of length N with distinct keys, on the average. The worst
  * case is ~N^2/2 compares and N^2 /2 exchanges and the best case is N-1 compares
  * and 0 exchanges.
  *
  * Running time of Insertion sort for already sorted or all element are same in  array is linear
  *
  * Stable yes relative order is maintain
  * online yes can sort a list as it receives it
  * Inplace  only require constant amount of additional memory space
  *
  * Insertion sort is used when number of elements is small.
  * It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.
  *
  * Complexity:
  *  1. Best n
  *  2. Average and wrost is n^2
  *
  * It iterates the input elements by growing the sorted array at each iteration.
  * It compares the current element with the largest value in the sorted array.
  * If the current element is greater, then it leaves the element in its place
  * and moves on to the next element else it finds its correct position in the
  * sorted array and moves it to that position. This is done by shifting all the elements,
  * which are larger than the current element, in the sorted array to one position ahead
  *
  * Unsorted Array == partial sorted array + Un-sorted Array
  *
  *
  */

/**
  * Insertion sort is an efficient method for partially sorted array
  * Partially Sorted array
  * partially sorted arrays are the
  * following:
  * ■ An array where each entry is not far from its final position
  * ■ A small array appended to a large sorted array
  * ■ An array with only a few entries that are not in place
  *
  *
  */


/**
  *
  * Selection sort and Insertion sort
  *
  * For example, you can see at a glance on the visual
  * traces at right that insertion sort does not touch
  * entries to the right of the scan pointer and selec-
  * tion sort does not touch entries to the left of the
  * scan pointer. Moreover, it is clear from the visual
  * traces that, since insertion sort also does not touch
  * entries smaller than the inserted item, it uses about
  * half the number of compares as selection sort, on
  * the average.
  *
  * This statement has been validated on many different computers over
  * the past half-century. Insertion sort was about twice as fast as selection sort when
  * the first edition of this book was written in 1980 and it still is today, even though it
  * took several hours to sort 100,000 items with these algorithms then and just several
  * seconds today. ( page 255)
  *
  *
  */


class InsertionSort {


  /**
    *
    * Iterate over array then rearrange all element before currwent index in sorting order
    * But this order is not final
    *
    * @param arr
    * @return
    */
  def sort(arr: Array[Int]): Array[Int] = {
    val length = arr.length
    for (i <- 0 until arr.length) {
      val key = arr(i)
      var j = i
      while (j > 0 && arr(j - 1) > key) {
        arr(j) = arr(j - 1)
        j = j - 1
      }
      arr(j) = key
    }
    arr
  }
}


object InsertionSort {

  def main(args:Array[String]):Unit = {
    val insertionSort = new InsertionSort
    val result = insertionSort.sort(Array(10,10,188,22,33))
    result.foreach(println)
  }
}