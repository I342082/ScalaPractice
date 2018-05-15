object Main extends App {
  val someNumbers = List(-11, -10, -5, 0, 5, 10)

  def sum(a: Int, b: Int, c: Int) = a + b + c

  // Partially applied functions
  //val a = sum   //this will error
  val b = sum (_, _, _)
  val c = sum _
  val d = sum (1, _: Int, 3)

  // First class functions e.g. foreach expects a function
  someNumbers.foreach(x => println(d(x)))

  // Repeated parameters
  def printMany(args: String*): Unit = {
    args.foreach(println)
  }

  printMany("Hi", "my", "name", "is", "sunny")

  // Named and Default arguments
  def speed(distance: Double, time: Double = 10): Double = distance / time
  println("Speed: "+speed(time = 10, distance = 700))
}