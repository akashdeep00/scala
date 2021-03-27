

object scalawhile {
  def main(args: Array[String]) = {
    var x = 0;

    //while loop
    while (x < 10) {
      println("x=" + x)
      x += 1
    }

    //do-while loop
    var y = 0
    do {
      println("y=" + y)
      y += 1;
    } while (y < 1)
      
      //for-loop
      for(a <- 1 to 9 ; j <- 1 to 3){
        println(a)
        println(j)
      }
    
    val l=List(1,2,3,54,6,7)
    for (i<-l){
      println(i)
    }
  }
}