object salary{
	def main(args:Array[String])={
		var s:Double=normal(40)+ot(20)-tax()
		println("Take home salary= Rs."+s)
	}

	def normal(a:Int):Double={
		var n=a*150.00
		return n
	}

	def ot(b:Int):Double={
		var o=b*75.00
		return o
	}
	def tax():Double={
		var x:Double=normal(40)+ot(20)
		var y:Double=x*0.1
		return y
	}
}