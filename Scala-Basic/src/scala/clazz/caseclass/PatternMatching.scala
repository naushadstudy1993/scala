package scala.clazz.caseclass

trait SuperTrait

case class Class1(a:Int, b:Int) extends SuperTrait
case class Class2(a:Int, b:Int, c:Int) extends SuperTrait
case class Class3(a:Int) extends SuperTrait
case object Class3 extends SuperTrait

object PatternMatching {
  def main(args: Array[String]): Unit = {
    matchObject(Class1(10,20))
    matchObject(Class2(10,20,30))
    matchObject(Class3(10))
    matchObject(Class3)
  } 
  
  def matchObject(obj : Product ) : Unit = obj match {
    case Class1(a,b) => println(s"$a => $b")
    case Class2(a,b,c) => println(s"$a => $b => $c")
    case Class3(a) => println(s"a=$a")
    case Class3 => println("0-args")
  }
}