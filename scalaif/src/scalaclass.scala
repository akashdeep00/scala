
//class definition
class user1(private var name: String, var age: Int) {
  def print {
    println(name)
    println(age)
  }
}

class user(var name: String, var age: Int) {
  
}


object scalaclass {
  def main(args: Array[String]) = {
    
    //object instance
    var user = new user("Akash", 20)
    println(user.name)
    println(user.age)
    
    
    user.name = "deep"
    println(user.name)
    
    var user1 = new user1("ad", 19)
    user1.print
  }
}