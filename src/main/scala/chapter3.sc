import scala.collection.mutable.ArrayBuffer

val nums = new Array[Int](10)
val a = new Array[String](10)
val s = Array("hello", "world")
s(0) = "goodbye"
s

val arr = ArrayBuffer(-1, 2, 3, 6, 7, 9, -3, 4)
val result = for (elem <- arr) yield 2 * elem

for (elem <- arr if elem % 2 == 0) yield 2 * elem

arr.filter(_ % 2 == 0).map(2 * _)

arr.filter(_ % 2 == 0) map (2 * _)

var first = true
val indexes = for (i <- arr.indices if first || arr(i) > 0) yield {
  if (arr(i) < 0) first = false; i
}
println(indexes)

for (j <- indexes.indices) arr(j) = arr(indexes(j)) //暂不理解为何结果为Unit = ()
arr.trimEnd(arr.length - indexes.length) //暂不理解为何结果为Unit = ()

Array(1, 232, 43, 12, 12, 21, 43).sum

Array(1, 232, 43, 12, 12, 21, 43).max

val b = ArrayBuffer(1, 22, 4, 51)
val bSorted = b.sorted

val bDescending = b.sortWith(_ > _)

val a2 = Array(12, 4, 3, 2, 32)
scala.util.Sorting.quickSort(a2)
for (elem <- a2) {
  print(elem + " ")
}

Array(1, 232, 43, 12, 12, 21, 43).mkString(" and ")
ArrayBuffer(1, 232, 43, 12, 12, 21, 43).toString

