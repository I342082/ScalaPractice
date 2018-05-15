object Main extends App {
  val rational1 = new Rational(10, 12)
  val rational2 = new Rational(4, 6)

  val sum = rational1 + rational2
  val diff = rational1 - rational2
  val prod = rational1 * rational2
  val div = rational1 / rational2
  val normSum = sum.normalize
  val normDiff = diff.normalize
  val normProd = prod.normalize
  val normDiv = div.normalize

  println(s"$rational1+$rational2 = $sum = $normSum")
  println(s"$rational1+$rational2 = $diff = $normDiff")
  println(s"$rational1+$rational2 = $prod = $normProd")
  println(s"$rational1+$rational2 = $div = $normDiv")

  val int2 = 3

  val sumInt = rational1 + int2
  val diffInt = rational1 - int2
  val prodInt = rational1 * int2
  val divInt = rational1 / int2
  val normSumInt = sumInt.normalize
  val normDiffInt = diffInt.normalize
  val normProdInt = prodInt.normalize
  val normDivInt = divInt.normalize

  println(s"$rational1+$int2 = $sumInt = $normSumInt")
  println(s"$rational1+$int2 = $diffInt = $normDiffInt")
  println(s"$rational1+$int2 = $prodInt = $normProdInt")
  println(s"$rational1+$int2 = $divInt = $normDivInt")
}