fun main(){
    print("Masukkan nilai kamu:")
    val nilai = readLine()
    val number: Boolean
    number = nilai?.matches("-?\\d+(\\.\\d+)?".toRegex())!!

    if (number) {
        when(nilai.toInt()){
            in 60..79 -> {
                println("Memuaskan")
            }
            in 80..89 -> {
                println("Sangat Memuaskan")
            }
            in 90..99 -> {
                println("Terpuji")
            }
            else -> println("Tidak lulus")
        }
    }
    else {
        println("Tidak dapat menginputkan selain angka!")
    }
}