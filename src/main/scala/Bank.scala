package bank

import person.Person
import scala.collection.mutable.ArrayBuffer

class Bank(val name: String){ 
    val clients: ArrayBuffer[Person] = new ArrayBuffer[Person]()

    def addClient(client: Person): Unit = {
        clients.addOne(client)
    }

    def removeClient(client: Person): Unit ={
        val index: Int = clients.indexOf(client)
        clients.remove(index)
    }
}