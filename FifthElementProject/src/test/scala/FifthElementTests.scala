import org.scalatest._
import Assertions._

class FifthElementTests extends FunSuite {

	test("Fifth element should be returned from list with length >= 5") {
		val list = 1 :: 2 :: 3 :: 4 :: 10 :: 6 :: Nil
		assertResult(10) {
			FifthElement.getFifthElement(list)
		}
		val list2 = 1 :: 2 :: 3 :: 4 :: 10 :: Nil
		assertResult(10) {
			FifthElement.getFifthElement(list2)
		}
	}

	test("Nil should be returned from list with length < 5") {
		val list = 1 :: 2 :: 3 :: Nil
		assertResult(Nil) {
			FifthElement.getFifthElement(list)
		}
	}
}
