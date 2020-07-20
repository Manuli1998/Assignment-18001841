import math.{sqrt,pow}
object distance extends App{
	val n1=Point(7,1)
	val n2=Point(9,7)
	val n3=n1.distance(n2)
	//val n3=n1.move(2,3)

	println("Point 1: " +n1)
	println("Point 2: " +n2)
	println("Distance :" +n3)

}

case class Point(a:Int,b:Int){
	def x:Int=a
	def y:Int=b
	def distance(i:Point):Double=sqrt(pow(x-i.x,2)+pow(y-i.y,2))

}