import scala.math._

val num = 3.14
//ceil函数后的_意味着你确实指的是这个函数，而不是碰巧忘了给他传参数
val fun = ceil _
fun(num)

Array(3.31, 32.33, 12.8).map(fun)

(x: Double) => 3 * x

