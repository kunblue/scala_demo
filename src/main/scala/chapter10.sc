trait Logger {
  def log(msg: String)

  def info(msg: String) {
    log("info: " + msg)
  }

  def warn(msg: String) {
    log("warn: " + msg)
  }

  def severe(msg: String) {
    log("warn: " + msg)
  }
}

class AccountLogger extends Logger {
  override def log(msg: String): Unit = {
    println(msg)
  }
}


class ConsoleLogger extends Logger with Cloneable with Serializable {
  def log(msg: String): Unit = {
    println(msg)
  }
}

trait Logged {
  def log(msg: String): Unit = {}
}

trait ShortLogger extends Logged {
  val maxLength = 15
}