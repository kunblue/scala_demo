import scala.math._

val num = 3.14
//ceil函数后的_意味着你确实指的是这个函数，而不是碰巧忘了给他传参数
val fun = ceil _
fun(num)

Array(3.31, 32.33, 12.8).map(fun)

(x: Double) => 3 * x

var increase = (x: Int) => x + 1
increase(11)

val f: Function1[Int, String] = myInt => "my int: " + myInt.toString
f(10)

val f2: Int => String = myInt => "my int v2: " + myInt.toString
f2(111)

val f3: () => Unit = () => {
  println("x")
}
f3()

val f4: Function0[Unit] = () => {
  println("x2")
}

f4()


val triple = (x: Double) => x * 3

Array(2.21, 321, 332).map((x: Double) => 3 * x)

Array(12, 2312.23, 2131) map { x: Double => 3 * x }

def valueAtQuarter(f: Double => Double) = f(0.25)
valueAtQuarter(ceil)
valueAtQuarter(sqrt)

def mulBy(factor: Double) = (x: Double) => factor * x
val quintuple = mulBy(3)
quintuple(290)

valueAtQuarter((x: Double) => 3 * x)

valueAtQuarter(x => 4 * x)

valueAtQuarter(5 * _)

val fun3 = 2 * (_: Double)

(1 to 9).map(0.1 * _)

(1 to 9).map("*" * _).foreach(println)

(1 to 9) filter (_ % 2 == 0) reduceLeft (_ * _)

(1 to 9) reduceLeft (_ * _)

"marry has a little lamb".split(" ").sortWith(_.length < _.length)

