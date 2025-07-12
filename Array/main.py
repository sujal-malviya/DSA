#create bank account class {constructor : owner , balance , func(deposit),(withdraw)(GETBALANCE)}
class bankaccount:
    def __init__(self,owner,balance):
        self.__balance= balance
        self.owner = owner
    def deposit(self,amount):
        if (amount > 0):
        self.__balance = amount
        print(f"amount credited = {amount}")
        print(f"total balance {self.__balance}")
    def withdraw(self,amount):
        self.__balance -= amount
        print(f"amount debited{amount}")
        print(f"total balance{self.__balance}")
    def getbalance(self):
        
        print(f"balance{self.__balance}")

b = bankaccount("sam",1000)
print(b.deposit(1500))
print(b.withdraw(500))
print(b.getbalance())
        
        
            
    
    