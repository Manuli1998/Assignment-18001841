object prinum{
	def main(args:Array[String])={
		println()
		println("Enter the number: ")
		var pn=scala.io.StdIn.readInt()
		println()
		primeSeq(pn)
	}
	
	def prime(a:Int,i:Int=2):Boolean={
		
		if(a<=2){
			if(a==2){
				return true
			}
			else{
				return false
			}
		}
		if(a%i==0){
			return false
		}
		if(i*i>a){
			return true
		}
		return prime(a,i+1)

	}

	def primeSeq(a:Int):Unit={
		if(prime(a)==true){
			println(a)
		}
		if(a>0){
			primeSeq(a-1)
		}
	}

}