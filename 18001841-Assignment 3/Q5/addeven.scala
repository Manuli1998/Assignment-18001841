object addeven{
	def main(args:Array[String])={
		println()
		println("Enter your number: ")
		var num=scala.io.StdIn.readInt()
		if(num%2==0){
			evensum(num-2)
		}
		else{
			evensum(num-1)
		}
	}
var s:Int=0
	def evensum(a:Int):Unit={
		s=s+a
		if(a==0){
			println("Sum of even numbers is: "+s)
		}
		else{
			evensum(a-2)
		}
	}

	
}