package com.lankun.demo

trait ConsoleLogger extends Logger {
  def log(msg: String) {
    println(msg)
  }
}
