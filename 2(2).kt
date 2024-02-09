import java.lang.Exception
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt
fun main()
{
    try
    {
        print("x= ")
        var x = readLine()!!.toDouble()
        print("K= ")
        var k = readLine()!!.toInt()
        print("M= ")
        var m = readLine()!!.toInt()
        print("N= ")
        var n = readLine()!!.toInt()

        var max = maxOf(k,n)
        var min = minOf(k,n)
        var y = 0.0;
        when (m == max)
        {
            true ->
            {
                y = sin(abs(x))/x.pow(2.0)
                println("y(x)= " + y)
            }
            false -> when(m == min)
            {
                true ->
                {
                    y = sin(abs(x))/(x.pow(2.0)+1)
                    println("y(x)= " + y)
                }
                false ->
                {
                    y = -1.0
                    println("y(x)= " + y)
                }
            }
        }

    }
    catch (e: Exception)
    {
        println("Введен неверный формат")
    }
}