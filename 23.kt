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
        print("y= ")
        var y = readLine()!!.toDouble()
        //В
        when (((x.pow(2) + y.pow(2)<=1 && x >= 0 && y <= 0)
                 || (x.pow(2) + y.pow(2)<=1 && x <= 0 && y <= 0))
                 || (x>= -1 && x <= 1 && y <= 2 && y >= 0))
        {
            true -> println("Точка входит в заштрихованную область на графике B")
            false -> println("Точка НЕ входит в заштрихованную область на графике B")
        }
        /*//А
        when (x <= 0 && y <= 0 && ((x >= -3 && y >= -1) || x + y >= -1))
        {
            true -> println("Точка входит в заштрихованную область на графике А")
            false -> println("Точка НЕ входит в заштрихованную область на графике А")
        }*/
        /*
                when (x.pow(2.0) + y.pow(2.0)<=1 && x<=-1 && x >=1 && y>=2 && y<=0)
                {
                    true -> println("Точка входит в заштрихованную область на графике В")
                    false -> println("Точка НЕ входит в заштрихованную область на графике В")
                }

                when (x>=-2 && x<=1 && y<=1 && y>=-2)
                {
                    true -> println("Точка входит в заштрихованную область на графике Г")
                    false -> println("Точка НЕ входит в заштрихованную область на графике Г")
                }

                 */
    }
    catch (e: Exception)
    {
        println("Введен неверный формат")
    }
}