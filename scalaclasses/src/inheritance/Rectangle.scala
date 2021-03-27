package inheritance

class Rectangle (var w : Double,var h:Double)extends Polygon with Shape {
  override def area:Double = w * h
  override def color:String="red"
}