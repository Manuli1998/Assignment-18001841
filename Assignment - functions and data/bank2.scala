
class account(id:String,accnum:Int,balance:Double){
	val nic:String=id
	var accountnumber:Int=accnum
	var accbalance:Double=balance

	val overdraft=(l:List[account])=> l.filter(x=>x.accbalance<0)
	val sumbalance=(l:List[account])=>l.reduce((a,b)=>(new account("all",0,a.accbalance+b.accbalance)))
	val interest=(l:List[account])=>l.map(a=>{ if(a.accbalance<0) (new account(a.nic,a.accountnumber,a.accbalance*1.05)) else(new account(a.nic,a.accountnumber,a.accbalance*1.1))})
	override def toString="["+nic+":"+accountnumber+":"+accbalance+"]"
	
}



object bank2{
def main(args:Array[String])={

	val bank:List[account]=List(
		new account("1",12345,22000.00),
		new account("2",12346,13000.00),
		new account("3",12347,-500.00),
		new account("4",12348,43000.00),
		new account("5",12349,15200.00),
		new account("6",12350,-267.00),
		new account("7",12351,90000.00),
	)
println("\n****************************************************************************************************\n")
println(" 1. Accounts with Negative balances are: "+bank(0).overdraft(bank))
	val x=bank(0).sumbalance(bank)
	println("\n 2. Sum of all account balances is Rs.: "+x.accbalance)
	println("\n\n 3. Final balances of all accounts after applying the interest are: "+bank(0).interest(bank))
	println("\n****************************************************************************************************\n")
}
}






