class rational(x:Int,y:Int){
	def numer=x
	def denom=y
	def neg=new rational(-this.numer,this.denom)
	override def toString = s"$numer/$denom"
};

object demo1{
	def main(args:Array[String])={
		println("Enter your number's numerator: ")
		var nume=scala.io.StdIn.readInt()
		println("Enter your number's denominator: ")
		var denom=scala.io.StdIn.readInt()
		val z=new rational(nume,denom)
		println(z.neg)

	}
}