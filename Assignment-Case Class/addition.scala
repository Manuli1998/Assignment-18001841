object addition extends App{
	val n1=Point(7,1)
	val n2=Point(9,7)
	val n3=n1+n2
	//val n3=n1.move(2,3)

	println("Number1: " +n1)
	println("Number1: " +n2)
	println("Number 1 + Number 2: "+n3)
}

case class Point(a:Int,b:Int){
	def x:Int=a
	def y:Int=b
	def +(i:Point)=Point(this.x+i.x,this.y+i.y)

}