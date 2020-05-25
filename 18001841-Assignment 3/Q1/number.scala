object number{
	def main(args:Array[String])={
		println()
		println("Enter the number: ")
		var pn=scala.io.StdIn.readInt()
		if(prime(pn)==true){
			println("True")
		}
		else{
			println("False")
		}
	}
	var i:Int=1
	def prime(a:Int):Boolean={
		i=i+1
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
		return prime(a)

	}
}