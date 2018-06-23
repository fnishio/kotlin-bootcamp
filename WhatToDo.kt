fun main(args: Array<String>) {
    println(whatShouldIDoToday(getYourMood()!!))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isGoodForWalk(mood, weather) -> "go for a walk"
        isDarkDay(mood, weather, temperature) -> "stay in bed" 
        isTooHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isGoodForWalk(mood: String, weather: String) =
    mood == "happy" && weather == "Sunny"

fun isDarkDay(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isTooHot(temperature: Int) = temperature > 35

fun getYourMood(): String {
  print("Enter your mood: ")
  return readLine()
}