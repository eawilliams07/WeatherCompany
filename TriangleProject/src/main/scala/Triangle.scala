

object Triangle {
  
  def triangleType(side1: Double, side2: Double, side3: Double) =
    if (side1 == side2 && side1 == side3 && side2 == side3) {
      "equilateral"
    }
    else if (side1 != side2 && side1 != side3 && side2 != side3) {
      "scalar"
    }
    else {
      "isosceles"
    }
  
  def main(args: Array[String])
  {
    triangleType(1,1,1)
  }
}
