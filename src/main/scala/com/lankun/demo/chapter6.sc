object Accounts {
  private var lastNumber = 0

  def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
}

Accounts.newUniqueNumber()


class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0

  def deposit(account: Double): Unit = {
    balance += account
  }
}

object Account {
  private var lastNumber = 0

  private def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
}

abstract class UndoableAction(val description: String) {
  def undo(): Unit

  def redo(): Unit
}


object DoNothingAction extends UndoableAction("Do nothing") {
  override def undo(): Unit = {}

  override def redo(): Unit = {}
}

val action = Map("open" -> DoNothingAction, "save" -> DoNothingAction)

Array("1", "2", "3", "4")

Array(Array(1, 2), Array(2, 3))

Array(100)
new Array(100)

class Account1 private(val id: Int, initialBalance: Double) {
  private var balance = initialBalance
}

object Account1 {
  def apply(initialBalance: Double) = new Account1(newUniqueNumber(), initialBalance)

  private var lastNumber = 0

  private def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
}

val acct = Account1(1000.0)


object Hello1 extends App {
  print("Hello world")
}

