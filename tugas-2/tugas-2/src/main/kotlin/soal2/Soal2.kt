package soal2

// TODO
fun minAndMax(number: Int): Int {
   val numbers = mutableListOf<Int>()
    while (num != 0) {
        val digit = num % 10
        numbers.add(digit) 
        num /= 10 
    }
    val n = numbers.size
    
    for (i in 1 until n) {
        val key = numbers[i]
        var j = i - 1
       
        while (j >= 0 && key < numbers[j]) {
            numbers[j + 1] = numbers[j]
            j--
        }
        numbers[j + 1] = key
    }
    return (numbers[0] + numbers[numbers.size - 1])
    
}
