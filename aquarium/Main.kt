//package aquarium

fun main (args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length}, Width: ${myAquarium.width}, Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(20, 15, 30)
    println("Small Aquarium: ${smallAquarium.volume} liters.")

    val myAquarium2 = Aruarium(numberOfFish = 9)
}