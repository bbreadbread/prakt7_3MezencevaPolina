import java.lang.Exception
import kotlin.math.sqrt
fun main()
{
    try
    {
        print("высота h= ")
        var h = readLine()!!.toDouble()
        var t = sqrt(2.0 * h / 9.81)
        println("Время падения: " + t + " сек.")
    }
    catch (e: Exception)
    {
        println("Введен неверный формат")
    }
}