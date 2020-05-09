fun main(){
    print("Masukkan nilai kamu:")
    var nilai = readLine()
    var number = true
    number = nilai?.matches("-?\\d+(\\.\\d+)?".toRegex())!!

    if (number) {
        when{
            (nilai>=60.toString() || nilai<80.toString()) -> {
                println("Memuaskan")
            }
            (nilai>=80.toString() || nilai<90.toString()) -> {
                println("Sangat Memuaskan")
            }
            (nilai>=90.toString() || nilai<100.toString()) -> {
                println("Sangat Memuaskan")
            }
            else -> println("Tidak lulus")
        }
    }
    else {
        println("Inputkan angka")
    }
}