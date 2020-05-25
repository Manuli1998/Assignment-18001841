object even{
	def main(args:Array[String])={
		println()
		println("Enter your number: ")
		var num=scala.io.StdIn.readInt()
		oddoreven(num)
	}

	def oddoreven(a:Int):Unit={
		if(a==0){
			println("Number is Even")
		}
		else if(a==1){
			println("Number is Odd.")
		}
		else {
			oddoreven(a-2)
		}
	}
}