

object scalafunc {

  object Math {
    
    //add func
    def add(x: Int, y: Int): Int = {
      return x + y
    }

    //square func
    def square(x: Int) = x * x
  }
  
  //functions
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  def sub(x: Int, y: Int): Int = {
    x - y
  }
  def mul(x: Int, y: Int): Int = x * y

  def div(x: Int, y: Int) = x / y

  //anonymous function - a function is assigned to variables

  var add1 = (x: Int, y: Int) => x + y;

  // higher order function
  
  def math(x : Double , y: Double, f : (Double,Double)=> Double):Double = f(x,y)
  
  def main(args: Array[String]) = {
    
    //calling function inside math object
    println(Math.add(12, 3))
    println(Math square 2);
    
    //calling functions
    println(add(10, 2))
    println(sub(10, 2))
    println(mul(10, 2))
    println(div(10, 2))

    
    //calling anonymous functions
    println(add1(200, 500))
    
    //calling higher order functions 
    val result = math(50,20,_+_)
    println(result)
  }
}