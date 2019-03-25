import java.util

import scala.collection.mutable
import scala.collection.JavaConverters.mapAsScalaMap

val scores = Map("a" -> 10, "b" -> 20, "c" -> 30)
val scores1 = scala.collection.mutable.Map("a" -> 10, "b" -> 20, "c" -> 30)
val scores2 = new mutable.HashMap[String, Int]
val scores3 = Map(("a", 1), ("b", 2), ("c", 3))

val aScore = scores("a")

val bScore = if (scores.contains("b")) scores("b") else 0

val cScore = scores.getOrElse("c", 0)

val cScore1 = scores.get("c1")

//scores1("b") = 111
//
//scores1("d") = 1211

scores1 += ("d" -> 11, "e" -> 22)

scores1 -= "a"

val newScores = scores + ("f" -> 4, "g" -> 6)

//val scores4: scala.collection.mutable.Map[String, Int] = new util.TreeMap[String, Int]()

var t = (1, 2.33, "34123")
//val second = t._2

val (first, second, _) = t

"Hello World".partition(_.isLower)

val symbols = Array("<", "-", ">")
val counts = Array("2", "10", "2")
val pairs = symbols.zip(counts)

//for ((s, n) <- pairs) print(s * n)

counts.zip(symbols).toMap
