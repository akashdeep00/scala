

object scala5 {
  
  //set - cannot have duplicate values
  val s: Set[Int]= Set(1,2,5,4,4)
  
  //maps - collection of key value pair
  val mymap : Map[Int,String] = Map(801 -> "max",802->"Tom")
  
  //tuples can contain different types of element, upto 22 values
  val t1= (1,2,"ds",true)
  val t2=new Tuple3(1,2,false)
  
  
   def main(args: Array[String]) = {
       println(s) 
       
       
       println(mymap)
       println(mymap(802))
       
       println(t1)
       println(t2)
       
       t1.productIterator.foreach{
         i=>println(i)
       }
    }
}