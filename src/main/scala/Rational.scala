class Rational (val numerator: Int, val denominator: Int) {
  require(denominator != 0)

  def this (n: Int) = this (n , 1)  //auxiliary constructor

  override def toString: String = s"$numerator/$denominator"

  def + (that: Rational): Rational = new Rational(this.numerator * that.denominator + that.numerator * this.denominator, this.denominator * that.denominator)

  def - (that: Rational): Rational = new Rational(this.numerator * that.denominator - that.numerator * this.denominator, this.denominator * that.denominator)

  def * (that: Rational): Rational = new Rational(this.numerator * that.numerator, this.denominator * that.denominator)

  def / (that: Rational): Rational = new Rational(this.numerator * that.denominator, this.denominator * that.numerator)

  def normalize: Rational = {
    def gcd(n1: Int, n2: Int): Int = {  // calculate Greatest Common Divisor for 2 numbers
      if (n2 % n1 == 0) n1
      else gcd (n2 % n1, n1)
    }

    val gcdValue = gcd(this.numerator, this.denominator)
    new Rational(this.numerator / gcdValue, this.denominator / gcdValue)
  }
}