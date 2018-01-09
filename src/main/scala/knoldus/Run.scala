package knoldus

object Run {
  def main(args: Array[String]): Unit = {
    val obj = new Operation
    val v1 = 10
    val v2 = 20
    val v3 = 70
    val v4 = 50
    val list = List(v1, v2, v3, v4)
    val num = 10
    val fib = obj.fibonaci(num)
    println(fib)
    val ans = obj.sumPro(num)
    println(ans)
    obj.stringInterpltn(list)
    val max = obj.maxFromList(list)
    println(max)
  }
}

