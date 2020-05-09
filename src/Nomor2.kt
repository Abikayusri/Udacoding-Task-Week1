fun main(args: Array<String>) {

val data = arrayOf(1,2,3,4,5,6,7,8,9,10)

    for (i in data.indices){
        val a = data[i]
        if (a%2 == 0){
            println("Nilai $a adalah ganjil")
        }
    }
}