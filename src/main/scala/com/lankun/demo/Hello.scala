package com.lankun.demo

object Hello extends App {
  if (args.length > 0) {
    println("Hello, " + args(0))
  } else {
    println("Hello world!")
  }
}

object PatternMatching extends App {
  for (i <- 1 to 100) {
    i match {
      case 10 => println(10)
      case 50 => println(50)
      case 80 => println(80)
      case _ =>
    }
  }
}


abstract class Person

case class Student(name: String, age: Int, studentNo: Int) extends Person

case class Teacher(name: String, age: Int, teacherNo: Int) extends Person

case class Nobody(name: String) extends Person

//SchoolClass为接受多个Person类型参数的类
case class SchoolClass(classDescription: String, persons: Person*)

//下列代码给出的是其模式匹配应用示例
object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    val sc = SchoolClass("学途无忧网Scala培训班", Teacher("摇摆少年梦T", 27, 2015), Student("摇摆少年梦", 27, 2015))
    sc match {
      case SchoolClass(_, Teacher(name, age, teacherNo), Student(name1, age1, studentNo)) => println(name + "-" + age + "-" + studentNo)
      case _ => println("Nobody")
    }
  }
}
