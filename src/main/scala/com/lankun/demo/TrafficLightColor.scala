package com.lankun.demo

object TrafficLightColor extends Enumeration {
  //  val Red, Yellow, Green = Value

  type TrafficLightColor = Value
  val Red = Value(0, "Stop")
  val Yellow = Value(10)
  val Green = Value("Go")

  def doWhat(color: TrafficLightColor) = {
    if (color == Red) {
      "stop"
    } else if (color == Yellow) {
      "hurry up"
    } else {
      "go"
    }
  }

  def main(args: Array[String]): Unit = {
    for (c <- TrafficLightColor.values) {
      println(c.id + ":" + c.toString)
    }
//    TrafficLightColor(0)
//    TrafficLightColor.withName("Red")
  }
}



