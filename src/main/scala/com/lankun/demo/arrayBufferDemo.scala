package com.lankun.demo

import scala.collection.mutable.ArrayBuffer

object arrayBufferDemo {

  val b = ArrayBuffer[Int]()

  b += 1

  b += (1, 2, 3, 4)

  b ++= Array(4, 55, 555)

  b.trimEnd(5)

  b.insert(2, 4)

  b.remove(2)

  def main(args: Array[String]): Unit = {
    print(b.toString)
  }
}
