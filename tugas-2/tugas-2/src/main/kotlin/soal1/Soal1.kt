package soal1

// TODO
fun sumOfBigThree(numbers: List<Int>): Int {
    val n = numbers.size
    for (i in 1 until n) {
    	val key = numbers[i]
    	var j = i - 1 
        while (j >= 0 && key > numbers[j]) {
            numbers[j + 1] = numbers[j] 
            j--
        }
    	numbers[j + 1] = key 
    }

    return numbers[0]+numbers[1]+numbers[2]

}
