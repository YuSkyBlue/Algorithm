import java.io.*
import java.util.Stack
fun main() = with(BufferedReader(InputStreamReader(System.`in`))){

    val stack =Stack<Char>()
    while(true){
        val str = readLine()
        if( str =="." ) return

        str.forEach { curChar ->

            val lastStackElement = if(stack.isNotEmpty()) stack.peek() else null

            if (curChar =='[' || curChar ==']' || curChar =='(' || curChar==')'){

                if(lastStackElement == '('){

                    if(curChar ==')') stack.pop()

                    else stack.add(curChar)
                } else if ( lastStackElement == '['){

                    if (curChar == ']') stack.pop()
                    else stack.add(curChar)
                } else stack.add(curChar)
            }
        }
        if (stack.isEmpty()) println("yes") else println("no")
        stack.clear()

    }
    close()

}