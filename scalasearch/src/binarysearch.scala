

object binarysearch {

  def search(arr: Array[Int], item: Int, l: Int, h: Int): Int =
    {
    
    if (l>h)
      return -1
      
      var m = l + (h - l) / 2

      //if found in middle
      if (arr(m) == item)
        return m

      // Searching in the first half
      else if (arr(m) > item)
        return search(arr, item, l, (m - 1))
        
        //searching in the last half
      else
        return search(arr, item, (m + 1), h)
    }

  def main(args: Array[String]) =
    {
      var arr = Array(1, 2, 3, 4, 11, 12, 15)
      var h = arr.length - 1
      var ele = search(arr, 11, 0, h);

      if (ele == -1)
        print("Not Found")

      else
        print("Element found at Index " + ele)
    }
}