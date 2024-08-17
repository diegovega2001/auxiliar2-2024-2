  package person

  import bank.Bank

  class Person(val name: String, var age: Int) { 
    var bank: Option[Bank] = None

    def birthday(): Unit = {
        age += 1
    }

    def register(newBank: Bank): Unit = {
        bank = Some(newBank)
        newBank.addClient(this)
    }

    def unRegister(currentBank: Bank): Unit = {
        currentBank.removeClient(this)
        bank = None
    }
  }