package soal3

// TODO
fun getMiddleCharacters(string: String): String {
    val size = string.length

    if (size % 2 != 0) {
        val middleIndex = size / 2
        return( string[middleIndex].toString())
        
    }
    else {
        val n = size / 2
        val char1 = string[n - 1] 
        val char2 = string[n]
        
        return( char1.toString() + char2.toString())
    }

}
