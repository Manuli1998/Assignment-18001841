object switch extends App{
	val n1=Point(7,1)
	val n2=n1.invert()

	println("Number before invertion: " +n1)
	println("Number after invertion: " +n2)
}

case class Point(a:Int,b:Int){
	def x:Int=a
	def y:Int=b
	def invert()=Point(y,x)

}