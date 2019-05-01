package algorithm.sorting


/**
  *
  * Selection sort
  * The selection sort algorithm sorts an array by repeatedly finding the
  * minimum element (considering ascending order) from unsorted part and putting it at the beginning.
  *
  * Time complexity is n^2
  * Auxillary space (1)
  * Swap :- never make more then n space
  * Stability :-  default is not stable (but can be made stable)
  *
  * The process of finding the smallest element on one pass through the array does not give much information
  * about where is the smallest element might be on the next pass.
  *
  * Each of the N exchanges changes the value of two array
  * entries, so selection sort uses N exchanges—the number of array accesses is a linear
  * function of the array size. None of the other sorting algorithms that we consider have
  * this property (most involve linearithmic or quadratic growth).
  *
  * The items to the left of current index are in sorted order during the sort.
  *
  * Running time of Selection sort for already sorted array is quadratic
  *
  * Complexity is n^2
  *
  * Search smallest element in array and exchange with first element of the array then again find second
  * smallest element in subarray and exchange ... i.e original array == sorted array + unsorted array == Sorted array
  *
  * consider another example if you have 200 glasses of different volume 100 ml, 110 ml, 120 ml, 130 ml, …. , 2080 ml
  * and 2090 ml. You find them spread on a room floor and want to place them such that the 2090 glass,
  * then 2080 glass inside it, then 2070 glass inside it and so on. This sort method is inefficient on
  * large lists because searching for the exact size will take a lot of time but this is the way selection sort works.
  *
  * Hope you’ll find these two examples helpful
  * https://www.toptal.com/developers/sorting-algorithms
  *
  */


class SelectionSort {


  /**
    * default implementation
    * this implementaion can be improved if we check whether there is swap or not
    * if no swap then we can break the loop
    *
    * @param arr
    * @return
    */
  def sort(arr: Array[Int]): Array[Int] = {
    val length = arr.length
    for (i <- 0 until arr.length) {
      var min_index = i
      for (j <- i + 1 until arr.length) {
        if (arr(j) < arr(min_index)) {
          min_index = j
        }

      }
      val temp = arr(min_index)
      arr(min_index) = arr(i)
      arr(i) = temp
    }

    arr
  }

}

object  SelectionSort {

  def main(args:Array[String]):Unit = {
    val selectionSortObject  = new SelectionSort
    var result = selectionSortObject.sort(Array(10,2,3,4,7))
    result.foreach(println)
  }
}
