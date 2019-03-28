package com.lankun.demo

class Message {
  val timeStamp = new java.util.Date()
}

sealed abstract class Person1

case class Student(name: String, age: Int, studentNo: Int) extends Person1

case class Teacher(name: String, age: Int, teacherNo: Int) extends Person1

case class Nobody(name: String) extends Person1

case class SchoolClass(classDescription: String, persons: Person1*)

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    val s: Person1 = Student("john", 18, 1024)
    //这边仅仅给出了匹配Student的情况，在编译时
    //编译器会提示
    //match may not be exhaustive. It would fail on the following inputs: Nobody(_), Teacher(_, _, _)
    s match {
      case Student(name, age, studentNo) => println("Student")
    }
  }
}