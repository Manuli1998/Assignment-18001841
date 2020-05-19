object books{
	def main(args:Array[String])={
		println("Cover price of a book: Rs. 24.95")
		println("Bookstore's Discount: 40%")
		println("Shipping cost: Rs 3 for first50 copies and 75 cents for each additional copy.")
		println()
		var total:Double=cover(60)-discount(60)+shipping(60)
		println("Total wholesale cost for 60 copies: " +total)
	}

	def cover(a:Int):Double={
		var x:Double=a*24.95
		return x
	}

	def discount(a:Int):Double={
		var y:Double=a*0.4
		return y
	}

	def shipping(a:Int):Double={
		var z:Double=3*a+(a-50)*.75
		return z
	}
}