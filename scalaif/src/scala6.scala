

object scala6 {
  
   val l1: List[Int] = List(1, 2, 3, 4, 5)
   val mymap : Map[Int,String] = Map(801 -> "max",802->"Tom")
   
   
   def main(args: Array[String]) = {
     
     // map() used to iterate over a collection and then apply a function to each element of collection
     println(l1.map(_*2))
     println(l1.map(x=>x+2))
     
     println(mymap.mapValues(x=>"hi "+x))
     
     //flatten 
     println(List(List(1,2,3),List(3,4,5)).flatten)

    //reduce - does binary operation
    println(l1.reduceLeft(_ + _))
     
    //fold - we can pass intial argument
    println(l1.foldLeft(100)(_+_))
    
    //scan - gives map of intermediate result
    println(l1.scanLeft(100)(_+_))
     
      }
}