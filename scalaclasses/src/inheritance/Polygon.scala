package inheritance

trait Shape{
  def color:String
}
class Polygon {
  def area:Double =0.0
}
object Polygon{
  def main(args:Array[String]){
    var poly=new Polygon;
    var rect=new Rectangle(7.2,4.8)
    printarea(rect)
    println(rect.color)
    var tri=new Traingle(1.2,2.4)
    printarea(tri)
  }
  def printarea(p: Polygon){
    println(p.area)
  }
}