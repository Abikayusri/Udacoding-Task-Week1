fun main(){
    val kelas = Nomor3()

    kelas.panggil1(10,"20",30.0)
}

class Nomor3 {
    fun panggil1(a:Int, b:String, c:Double):Int{
        val result = a + b.toInt() + c.toInt()

        println(result)
        return result
    }
}