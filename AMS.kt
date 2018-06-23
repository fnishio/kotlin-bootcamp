import java.util.*

fun main(args: Array<String>) {
  println("Hello, ${args[0]}!")
  println(canAddFish(10.0, listOf(3,3,3)))
  println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
  println(canAddFish(9.0, listOf(1,1,3), 3))
  println(canAddFish(10.0, listOf(), 7, true))
  //feedTheFish()
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(
  day: String,
  temperature: Int = 22,
  dirty: Int = getDirtySensorReading()) : Boolean {

    return when (
      isTooHot(temperature) -> true
      isDirty(dirty)-> true
      isSunday(day) -> true
      else -> false
    )
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Suday"

fun feedTheFish() {
  val day = randomDay()
  val food = fishFood(day)
  println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
  val week = listOf("Sunday", "Monday", "Tuesday",
    "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
  return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String {
  return when (day) {
    "Monday" -> "flakes"
    "Wednesday" -> "redworms"
    "Thursday" -> "mosquitoes"
    "Sunday" -> "plankton"
    else -> "fasting"
  }
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}