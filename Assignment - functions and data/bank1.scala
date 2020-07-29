class account(id:String,accnum:Int,balance:Double){
	var nic:String=id
	var accountnumber:Int=accnum
	var accbalance:Double=balance

	def withdraw(w:Double)=this.accbalance=this.accbalance-w
	
	def deposit(d:Double)={
		this.accbalance=this.accbalance+d
	}
	def transfer(a:account,m:Double)={
		this.withdraw(m)
		a.deposit(m)
	}
}

object bank1{
	def main(args:Array[String])={
		val first=new account("987250470V",2222,30000.90)
		val second=new account("968994704V",2233,20000.90)
		println("\n\n'First' account's Balance: "+ first.accbalance)
		println(" \n'Second' account's Balance: "+second.accbalance)
		println("\n\nTransfer rs.500.00 from account 'first' to account 'second':")
		first.transfer(second,500.00)
		println("\nNow 'First' account's Balance: "+ first.accbalance)
		println("\nNow 'Second' account's Balance: "+second.accbalance)

	}
}