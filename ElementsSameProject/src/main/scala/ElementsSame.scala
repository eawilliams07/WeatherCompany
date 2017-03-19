

object ElementsSame {
  
  def elementsSame(l1: List[Int], l2: List[Int]) : Boolean = {
    l1.forall(l2.contains) || l2.forall(l1.contains)
  }
  
  def main(args: Array[String])
  {
    val list1 = 1 :: 2 :: 3 :: 4 :: 10 :: 6 :: Nil
    val list2 = 2 :: 1 :: 3 :: 4 :: 10 :: Nil
    elementsSame(list1, list2)
  }
}
