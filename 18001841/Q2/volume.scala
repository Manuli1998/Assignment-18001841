object volume{
	def main(args:Array[String])={

		println("Volume= "+vol(5))
	}

	def vol(a:Int):Double={
		var v:Double=4/3*math.Pi*a*a*a
		return v
	}
}