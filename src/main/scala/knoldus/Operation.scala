package knoldus

class Operation {
  def sumPro(num: Int): Int = {
  def sumOfDigits(b: Int): Int = {
    if (b < 10) b else b % 10 + sumOfDigits(b / 10)
  }

  val pro: Int = (1 to num).product
  if (pro < 10) {
    pro
  }
  else {
    pro % 10 + sumOfDigits(pro / 10)
  }

}

  def maxFromList(list: List[Int]): Int = {
    if (list.isEmpty) {
      throw new RuntimeException("list is empty")
    }
    if (list.length == 1) {
      list.head
    }
    else {
      if (list.head >= maxFromList(list.tail)) {
        list.head
      } else {
        maxFromList(list.tail)
      }
    }
  }


  def fibonaci(num: Int): Int = {
    def fibinternal(n: Int, first: Int = 0, second: Int = 1): Int = n match {
      case 0 => first
      case 1 => second
      case _ => fibinternal(n - 1, second, (first + second))
    }

    fibinternal(num)
  }

  def stringInterpltn(str: List[Int]): Int = {
    if (str.isEmpty) {
      0
    }
    else {
      str.zipWithIndex.foreach { e =>
        val (c, n) = e
        println(s"$n = $c")
      }
    }
    1
  }


}
