import java.io.PrintWriter

import scala.io.Source

//val source = Source.fromFile("myfile.txt","utf-8")
val source1 = Source.fromURL("http://baidu.com", "utf-8")
val lineIterator = source1.getLines()
for (l <- lineIterator) println(l)

val lines = source1.getLines().toArray
for (l <- lines) println(l)

val contents = source1.mkString
println(contents)

val source2 = Source.fromString("http://baidu.com")

val out = new PrintWriter("numbers.txt")
for (i <- 1 to 100) out.print(i)
out.close()