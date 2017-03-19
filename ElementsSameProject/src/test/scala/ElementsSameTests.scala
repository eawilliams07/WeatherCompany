import org.scalatest.FunSuite

class ElementsSameTests extends FunSuite {

	test("Should return true if lists contain same elements") {
		val list1 = 1 :: 2 :: 3 :: 4 :: 10 :: Nil
    		val list2 = 2 :: 1 :: 3 :: 4 :: 10 :: Nil
		assert(ElementsSame.elementsSame(list1, list2) == true)
	}

	test("Should return true if first list contains all elements of second list") {
		val list1 = 1 :: 2 :: 3 :: 4 :: 10 :: 6 :: Nil
    		val list2 = 2 :: 1 :: 3 :: 4 :: 10 :: Nil
		assert(ElementsSame.elementsSame(list1, list2) == true)
	}

	test("Should return true if second list contains all elements of first list") {
    		val list1 = 2 :: 1 :: 3 :: 4 :: 10 :: Nil
		val list2 = 1 :: 2 :: 3 :: 4 :: 10 :: 6 :: Nil
		assert(ElementsSame.elementsSame(list1, list2) == true)
	}

	test("Should return false if lists contain different elements") {
    		val list1 = 2 :: 1 :: 3 :: 4 :: 10 :: 8 :: Nil
		val list2 = 1 :: 2 :: 3 :: 4 :: 10 :: 6 :: Nil
		assert(ElementsSame.elementsSame(list1, list2) == false)
	}
}
