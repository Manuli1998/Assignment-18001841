object fibo{
	def main(args:Array[String])={
		println()
		var i:Int=0
		println("Enter your number: ")
		var n=scala.io.StdIn.readInt()
		for(i<-0 to n){
			var result=fibonacci(i)
			println(result)
	}
	}


	def fibonacci(a:Int):Int={
		if(a==1){
			return 1
		}
		else if(a==0){
			return 0
		}
		else{
				return(fibonacci(a-1)+fibonacci(a-2))
		}

	}
}