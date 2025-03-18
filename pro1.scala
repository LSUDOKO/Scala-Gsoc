import scala.io.StdIn

@main def temperatureConversion: Unit =
   println("Enter temperature in Celsius:")
   val celsius = StdIn.readLine().toDouble
   val fahrenheit = celsius * 9/5 + 32
   println(s"Temperature in Fahrenheit: $fahrenheit")