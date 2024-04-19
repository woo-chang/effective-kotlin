package item24.response

sealed class Response<out R, out E>
class Failure<out E>(val error: E) : Response<Nothing, E>()
class Success<out R>(val value: R) : Response<R, Nothing>()

open class Car
interface Boat
class Amphibious : Car(), Boat

fun getAmphibious(): Amphibious = Amphibious()

fun main() {
    val car: Car = getAmphibious()
    val boat: Boat = getAmphibious()

    val garage: Box<Car> = Box(Car())
    val amphibiousSpot: Box<Amphibious> = garage
    //val otherBoat: Boat = garage.value //Car를 반환하지만, Boat를 위한 공간이다.

    val noSpot: Box<Nothing> = Box<Car>(Car())
    //val boat: Nothing = noSpot.value //Car를 반환하지만, 아무것도 원하지 않는다.
}

class Box<in T>(
    private var value: T?,
) {
    //val value: T //코틀린에서 사용할 수 없다. 어떤 타입이 들어있는지 확실하게 모르기 때문이다.
    fun set(value: T?) {
        this.value = value
    }

    //오류가 발생한다.
    //fun get(): T? = value
}

