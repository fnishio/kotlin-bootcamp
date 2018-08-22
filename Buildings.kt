open class BaseBuildingMaterial {
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<T: BaseBuildingMaterial> (val material: T){
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = material.numberNeeded * baseMaterialsNeeded
    fun build() {
        println("$actualMaterialsNeeded is needed for ${material::class.simpleName}")
    }
}

fun main(args: Array<String>) {
    val building = Building(Wood())
    building.build()
}