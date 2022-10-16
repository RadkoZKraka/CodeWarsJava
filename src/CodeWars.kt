    fun main(){
        println(getAge("8 Years old"))
    }
    fun getAge(yearsOld: String): Int {

        // your code here
        return yearsOld[0].digitToInt()
    }