import org.scalatest.FunSuite

class TriangleTests extends FunSuite {

	test("Triangle with three equal sides should result in equilateral") {
		assert(Triangle.triangleType(1,1,1) == "equilateral")
	}

	test("Triangle with two equal sides should result in isosceles") {
		assert(Triangle.triangleType(2,2,1) == "isosceles")
		assert(Triangle.triangleType(1,2,2) == "isosceles")
		assert(Triangle.triangleType(2,1,2) == "isosceles")
	}

	test("Triangle with no equal sides should result in scalar") {
		assert(Triangle.triangleType(1,2,3) == "scalar")
	}
}
