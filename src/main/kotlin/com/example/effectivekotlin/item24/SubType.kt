package item24.subclass

open class Dog
class Puppy : Dog()
class Hound : Dog()

fun takeDog(dog: Dog) {}

class Box<out T> {
    //var value: T? = null //public으로 열려 있으면 값을 설정할 수 있기에 오류가 발생한다.
    private var value: T? = null

    fun get(): T = value ?: error("Value not set")

    //코틀린에서는 사용할 수 없다.
    //fun set(value: T) {
    //    this.value = value
    //}
    //객체 내부에서는 업캐스트 객체에 out 한정자를 사용할 수 없기에 오류가 발생하지 않는다.
    private fun set(value: T) {
        this.value = value
    }
}

fun main() {
    takeDog(Dog())
    takeDog(Puppy())
    takeDog(Hound())

    val puppyBox = Box<Puppy>()
    val dogBox: Box<Dog> = puppyBox
    //dogBox.set(Hound()) //Hound를 넣으려고 했지만, Puppy를 위한 공간이다.

    val dogHouse = Box<Dog>()
    val box: Box<Any> = dogHouse
    //box.set("Some String") //String을 넣으려고 했지만, Dog를 위한 공간이다.
    //box.set(42) //Int를 넣으려고 했지만, Dog를 위한 공간이다.
}
