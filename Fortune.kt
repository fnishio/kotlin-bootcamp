fun main(args: Array<String>) {
   var fortune: String
   /*
   for (i in 1..10) {
      fortune = getFortune(getBirthday())
      println("\nYour fortune is: $fortune")
      if (fortune.contains("Take it easy")) break;
   }
   */
   /*
   repeat(10) {
      fortune = getFortune(getBirthday())
      println("\nYour fortune is: $fortune")
      if (fortune.contains("Take it easy")) break;
   }
   */
   fortune = ""
   while(!fortune.contains("Take it easy")) {
      fortune = getFortune(getBirthday())
      println("\nYour fortune is: $fortune")
   }
}

fun getBirthday() : Int {
  print("Enter your birthday: ")
  return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday : Int) : String {
  val fortunes = listOf(
    "You will have a great day!",
    "Things will go well for you today.",
    "Enjoy a wonderful day of success.",
    "Be humble and all will turn out well.",
    "Today is a good day for exercising restraint.",
    "Take it easy and enjoy life!",
    "Treasure your friends because they are your greatest fortune.")

  return fortunes[ when(birthday) {
    in 1..7 -> 1
    28, 31 -> 2
    else -> birthday.rem(fortunes.size)
  }]
}
