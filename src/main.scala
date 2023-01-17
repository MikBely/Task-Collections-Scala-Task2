import scala.collection.immutable.Stream.cons
def highestLowest (str:String):String =
  val strArray = str.split(' ')
  val strList = strArray.toList
  val numList = strList.map ((elem) => elem.toInt)
  var max = numList.max
  var min = numList.min
  min.toString+" "+max.toString


@main
def main(): Unit = {
  //val stream = 1 #:: 2 #:: 3 #:: 4 #:: 7 #:: 10 #:: 198 #:: Stream.empty

  //stream.take(6).println
  //val stream1 = Stream (1,2,3,39,20,3434,9)
  //stream1.takeRight(3).print
  var test = "1 34 3 -4 54 -92"
  println(highestLowest(test))
  var test1:Int = 17247;
  println(test1.compare(7000000))
  println(test1.equals(17247))
  println(test.repeat(4))
}