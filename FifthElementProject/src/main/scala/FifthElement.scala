

object FifthElement {
  
  def getFifthElement(list: List[Int]) : Any = {
    getFifthRecur(list, 1)
  }
  
  def getFifthRecur(list: List[Int], count: Int) : Any = {
    (list, count) match {
     case (Nil, _) => return Nil
     case (h :: t, 5) => return h
     case (h :: t, _) => getFifthRecur(t, count+1)
    }

	//if (list == Nil) { Nil }
	//else if (count == 5) { list.head }
	//else { getFifthRecur(list.tail, count + 1) }
  }
  
  def main(args: Array[String])
  {
    val list = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil
    println(getFifthElement(list))
  }
}
