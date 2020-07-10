object caesercipher{
	
	val E=(c:Char,shift:Int,text:String)=>text((text.indexOf(c.toUpper)+shift)%26)

	val D=(c:Char,shift:Int,text:String)=>text((text.indexOf(c.toUpper)-shift)%26)

		

	val cipher=(algo:(Char,Int,String)=>Char,s:String,shift:Int,text:String)=>s.map(algo(_,shift,text))


	def main(args:Array[String])={
		val text:String="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		val input:String=scala.io.StdIn.readLine("Enter the text: ")
		println("Enter the shift: ")
		val sh:Int=scala.io.StdIn.readInt()
		println("What do you want to do?\n\tType E to encrypt\n \tType D to decrypt\n ")
		val letter=scala.io.StdIn.readChar()
		if(letter=='E'){
			val result=cipher(E,input,sh,text)
			println("Encrypted Text: "+result)
		}
		else if(letter=='D'){
		val result=cipher(D,input,sh,text)
		println("Decrypted Text: "+result)
	}
	else{
		println("Please type a valid letter!")
	}
		
	}
}