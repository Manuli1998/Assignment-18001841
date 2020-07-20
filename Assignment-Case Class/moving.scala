object moving extends App{
	val n1=Point(7,1)
	val n2=n1.move(4,1)


	println("Number before moving: " +n1)
	println("Number after moving: " +n2)
}

case class Point(a:Int,b:Int){
	def x:Int=a
	def y:Int=b
	def move(i:Int,j:Int)=Point(this.x+i,this.y+j)

}