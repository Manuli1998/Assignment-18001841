object temperature{
	def main(args:Array[String])={
		println("35 C= " +convert(35.00))
	}

	def convert(a:Double):Double={
		var f=a*1.8000+32.00
		return f
	}
}