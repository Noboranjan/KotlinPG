fun main(args : Array<String> )
{
    val mult3=makeMathFunc(3)
    println("5*3 =${mult3(5)}")
    println("Multipling by 2\nInput:1 2 3 4 5")
    val mul2={num1: Int->num1*2}
    val numList2= arrayOf(1,2,3,4,5)
    mathonlist(numList2,mul2)

}
fun makeMathFunc(num1:Int): (Int)->Int = { num2 ->num1*num2}
fun mathonlist( numList: Array<Int>, myFunc:(num : Int)-> Int)
{
    for(num in numList){
        println("Math On List ${myFunc(num)}")
    }
}