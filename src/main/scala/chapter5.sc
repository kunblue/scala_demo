import java.io.FileReader
import java.util.Properties

import scala.collection.mutable.ArrayBuffer

class Person {
  var age = 0
}

class Counter {
  private[this] var value = 0

  def increment(): Unit = {
    value += 1
  }

  def getValue: Int = {
    value
  }

  def isLess(other: Counter) = value < other.getValue
}

class Person1 {
  private var name = ""
  private var age = 0

  def this(name: String) {
    this()
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }
}

val p1 = new Person1()
val p2 = new Person1("a")
val p3 = new Person1("a", 1)

class Person2(val name: String = "", val age: Int) {

  print("test")
  print(name + " is " + age + " years old")

  def a = 0

  private val props = new Properties()
  props.load(new FileReader("test.config"))

  def main(args: Array[String]): Unit = {
    new Person2("aa", 11)
  }
}

class NetWork(val name: String) {
  outer =>

  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]()

    def description = name + " inside " + outer.name
  }

  private val members = new ArrayBuffer[Member]()

  def join(name: String): Member = {
    val m = new Member(name)
    members += m
    m
  }

}

