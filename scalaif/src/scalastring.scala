

object scalastring {

  //array
  val myarray2 = new Array[Int](5)
  val myarray = Array(1, 2, 3, 4);
  
   
  
  val num1 = 75;
  val num2 = 100.25;
  
  //string
  val str1: String = "Hello"
  val str2: String = "abcd"

  //list- collections of similar data-type elements(immutable)

  val l1: List[Int] = List(1, 2, 3, 4, 5)
  val l2: List[String] = List("ad", "sd");
  

  
  
  def main(args: Array[String]) = {
    
    //string operations
    println(str1.length());
    println(str1.concat(str2));
    println(str1 + str2)

    val result = printf("(%d -- %f -- %s)", num1, num2, str1)

    
    //array traverse
    for (x <- myarray) {
      println(x)
    }

//list operations
    println(l1);
    println(l2);
    println(l1.head)
    println(l2.tail)
    println(l1.isEmpty)
    println(l1.reverse)
    l1.foreach(println)
    
    //list sum
    var sum : Int=0
    l1.foreach(sum+=_)
    println(sum)
  }
}