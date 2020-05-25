object add{
	def main(args:Array[String])={
		println()
		println("Enter your number: ")
		var num=scala.io.StdIn.readInt()
		println()
		var result=sum(num)
		println("Addition is: "+result)
	}
	var s=0
	def sum(a:Int):Int={
		s=s+a
		if(a>0){
			sum(a-1)
		}
		else{
			return s
		}
	}


}