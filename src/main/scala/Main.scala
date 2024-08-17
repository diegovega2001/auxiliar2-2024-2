import person.Person
import bank.Bank

object Main {
  def main(args: Array[String]): Unit = {
    val bank = new Bank("MyBank")
    val persona1 = new Person("Diego", 23)
    persona1.register(bank)
    println(s"Persona ${persona1.name} registrada en el banco.")
    persona1.birthday()
    println(s"Edad actual de ${persona1.name}: ${persona1.age}")
    persona1.unRegister(bank)
    println(s"Persona ${persona1.name} desregistrada del banco.")
  }
}

