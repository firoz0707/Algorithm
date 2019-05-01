package algorithm.sorting


/**
  *
  * The idea is to rearrange the array to give it the property that taking every hth entry
  * (starting anywhere) yields a sorted subsequence. Such an array is said to be h-sorted.
  *
  *
  */
class ShellSort {

  def sort(arr: Array[String]): Unit = {
    val length = arr.length
    var gap = length / 2
    while (gap < length) {
      for (i <- gap until length) {
        var temp = arr(i)
        var j = i
        while (j >= gap && arr(j - gap) > temp) {
          arr(j) = arr(j - gap)
          j = j - gap
        }

        arr(j) = temp


      }

      gap = gap / 2
    }
  }

}
