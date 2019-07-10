class Palindrome {


    fun main(args: Array<String>) {
        checkPalindrome("abcdcba")
    }

    var start = 0
    var last = 0
    var word = ""

    fun checkPalindrome(inputString: String): Boolean {
        start = 0
        word = inputString
        last = word.length
        var result = isPalindrome()
        print(result)
        return result
    }

    fun isPalindrome() : Boolean {

        if(last <= 1) return true

        if(word[start] == word[last - 1]) {
            last--
            start++
            isPalindrome()
        }

        return false
    }


}