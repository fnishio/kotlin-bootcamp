//package aquarium

fun main (args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length}, Width: ${myAquarium.width}, Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(20, 15, 30)
    println("Small Aquarium: ${smallAquarium.volume} liters.")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium2: ${myAquarium2.volume} liters with " +
        "length ${myAquarium2.length} width ${myAquarium2.width} " +
        "height ${myAquarium2.height}")
}

fun feedFish(fish: FishAction) {
    fish.eat()
}
fun makeFish() {
    val shark = Shark()
    val plecostomus = Plecostomus()
    println("Shard: ${shark.color} \nPlecostomus: ${plecostomus.color}")

    shark.eat()
    plecostomus.eat()
}