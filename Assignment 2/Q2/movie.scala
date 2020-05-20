object movie{
	def main(args:Array[String])={
		println()
		println("Enter the ticket price: ")
		var tp=scala.io.StdIn.readInt()
		var profit:Double=revenue(tp)-cost(tp)
		println()
		println("Your Profit will be: Rs."+profit)
	}

	def attend(a:Int):Int={
		var att=120+((15-a)*20/5)
		return att
	}

	def revenue(a:Int):Double={
		var r=attend(a)*a
		return r
	}

	def cost(a:Int):Double={
		var c=500+attend(a)*3
		return c
	}
}