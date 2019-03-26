package com.lankun.demo

object Hello extends App {
  if (args.length > 0) {
    println("Hello, " + args(0))
  } else {
    println("Hello world!")
  }
}
