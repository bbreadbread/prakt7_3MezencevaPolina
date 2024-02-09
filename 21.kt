import java.lang.Exception
import kotlin.math.pow
import kotlin.math.sqrt
fun main()
{
    try
    {
        println("диагональ прямоугольника d= ")
        var d = readLine()!!.toDouble()
        println("большее основание прямоугольника a= ")
        var a = readLine()!!.toDouble()
        var b = sqrt(d.pow(2.0) - a.pow(2.0))
        var s = a * b
        when (b <= a) {
            true ->
            {
                println("меньшее основание b= " + b)
                println("площадь s= " + s)
            }
            false ->
            {
                println("введенное значение a не является большей стороной")
            }
        }

    }
    catch (e: Exception)
    {
        println("Введен неверный формат")
    }
}