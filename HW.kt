/**
 * Created by NILOY on 30-Aug-17.
 */
fun main(args : Array<String>){
    println("Hellow World!!\nWelcome to MyWorld!")

    val num = 1..10
    println("3 is in num ${3 in num}")
    println("sum ${GetSum(1,2,3,4,5)}")
    println("5 fact ${fact(5)}")

}
fun GetSum(vararg nums:Int ): Int
{
    var sum = 0
    nums.forEach { n -> sum+=n }
    return sum
}
fun fact( x: Int) : Int{
    tailrec fun factTail(y:Int,z:Int):Int{
        if(y ==0 ) return z
        else return factTail(y-1,y*z)
    }
    return factTail(x,1)

}
