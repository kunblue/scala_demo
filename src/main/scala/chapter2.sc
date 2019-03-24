var r = 1
var n = 7
while (n > 0) {
  r = r * n
  n -= 1
}
print(r)
for (i <- 1 to 10) {
  r = r * i
}
print(r)

var s = "Hello"
var sum = 0
for (i <- s) {
  sum += i
}
print(sum)

for (i <- 1 to 3; j <- 1 to 3 if i != j) {
  print(10 * i + j + " ")
}

for (i <- 1 to 3; from = 4 - i; j <- from to 3) {
  print(10 * i + j + " ")
}

for (i <- 1 to 10) yield i % 3

for (i <- res8) {
  print(i + " ")
}

for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar
for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar

def sba(x: Double) = if (x >= 0) x else -x

def fac(n: Int) = {
  var r = 1
  for (i <- 1 to n) {
    r = r * i
  }
  r
}

def fac1(n: Int): Int = if (n < 0) 1 else n * fac1(n - 1)

def decorate(str: String, left: String = "[", right: String = "]") = left + str + right

def sum(args: Int*): Int = {
  var result = 0
  for (arg <- args) {
    result += arg
  }
  result
}

val s1 = sum(1, 2, 3, 4, 5, 5)
val s2 = sum(1 to 5: _*)

def recursiveSum(args: Int*): Int = {
  if (args.isEmpty) 0 else args.head + recursiveSum(args.tail: _*)
}
recursiveSum(1, 2, 3, 3)


def box(s: String) {
  val border = "-" * s.length + "--\n"
  print(border + "|" + s + "|\n" + border)
}

box("Hello")

lazy val words = scala.io.Source.fromFile("C:\\study\\scala\\README.md").mkString
//print(words)