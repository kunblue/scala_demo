package com.lankun.demo

class Employee4(val id: Int) extends Person4 {
  override var name: String = ""

  def main(args: Array[String]): Unit = {
    val a = new Person4 {
      override val id: Int = 111
      override var name: String = "lankun"
    }
  }
}
