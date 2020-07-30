import math.abs
class rational(x:Int,y:Int){
	def gcd(a:Int,b:Int):Int={if(b==0){
		a
	}
	else{
		gcd(b,a%b)
	}
}
	def numer=x/gcd(Math.abs(x),y)
	def denom=y/gcd(Math.abs(x),y)
	def neg=new rational(-this.numer,this.denom)
	
	def sub(a:rational)=new rational(this.numer*a.denom-a.numer*this.denom,denom*a.denom)
	override def toString = s"$numer/$denom"
};	

object demo2{
	def main(args:Array[String])={
		val x=new rational(3,4)
		val y=new rational(5,8)
		val z=new rational(2,7)
		println(x.sub(y).sub(z))

	}
}