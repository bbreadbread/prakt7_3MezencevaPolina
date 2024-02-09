import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    try {
        print("a= ")
        val a = readLine()!!.toDouble()
        print("b= ")
        val b = readLine()!!.toDouble()
        print("c= ")
        val c = readLine()!!.toDouble()
        val D = b.pow(2.0) - 4 * a * c
        var x1 = 0.0
        var x2 = 0.0
        when( a!=0.0 && b!=0.0 && c!=0.0 )
        {
            true ->
            {
                if(D < 0.0)
                {
                    println("Нет корней")
                }
                else if (D == 0.0)
                {
                    x1 = (-1 * b)/(2 * a)
                    println("Один корень.\nx1= " + x1)
                }
                else
                {
                    x1 = (-1 * b + sqrt(D))/(2 * a)
                    x2 = (-1 * b - sqrt(D))/(2 * a)
                    println("Два корня.\nx1= " + x1 + "\nx2= " + x2)
                }
            }
            false -> when(a != 0.0)
            {
                true ->
                {
                    if (c == 0.0 && b != 0.0)
                    {
                        x1 = 0.0
                        x2 = -1.0 * b
                        println("Два корня.\nx1= " + x1 + "\nx2= " + x2)
                    }
                    else if (b == 0.0 && c != 0.0 && c<0)
                    {
                            x1 = sqrt(-1 * c)
                            x2 = x1
                            println("Два корня.\nx1= " + ((-1) * x1) + "\nx2= " + x2)
                    }
                    else
                    {
                        println("Корней нет.")
                    }
                }
                false ->
                {
                    println("Число а не может быть равно 0. Ошибка.")
                }
            }
        }

    }
    catch (e:Exception)
    {
        println("Неверный формат введенных данных")
    }
}