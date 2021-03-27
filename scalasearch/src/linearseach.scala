

object linearseach {
  
  def lsearch(arr : Array[Int],item:Int)={
     var n:Int=arr.length
     var i  =0
    		 for(i<-0 to n)
    		 {
    		    if (arr(i) == item)
                print("Element found at Index " + i)
    		 }
    		     
  }
  
  def main(args:Array[String])={
    var arr = Array(1, 2, 3, 4, 11, 12, 15)
    lsearch(arr, 11);

     
  }
}