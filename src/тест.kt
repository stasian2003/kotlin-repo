var myMap: HashMap<String, String>? = null

fun main() {

    val names = arrayOf("KG","RU","USA","TR")
    val kody = arrayOf("+996","+7","+1","+90")

    myMap = hashMapOf()

        for (i in names.indices) {
            myMap?.put(names[i],kody[i])
        }

    println(myMap)
    println(myMap?.get("TR"))

}