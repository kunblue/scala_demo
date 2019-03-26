package com.lankun.demo

class Employee(name: String) extends Person3(name) {
  override def id: Int = name.hashCode
}
