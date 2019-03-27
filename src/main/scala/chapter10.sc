trait Logger {
  def log(msg: String)
}

class ConsoleLogger extends Logger with Cloneable with Serializable{
  def log(msg: String): Unit = {
    println(msg)
  }
}