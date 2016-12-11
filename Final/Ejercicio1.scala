package Final

object Ejercicio1 {
  def Rdup(l:List[Int]):List[Int]={
    if(l.isEmpty){
      List()
    }
    else
    {
      if(l.tail.isEmpty)
        List(l.head)
      else{
        if (!l.tail.isEmpty && l.head == l.tail.head)
          Rdup(l.tail)
        else
          l.head :: Rdup(l.tail)
      }
    }
  }
  def Imprimir(l:List[Int]){
    if (!l.isEmpty)
    {
      println(l.head)
      Imprimir(l.tail)
    }
    }
    def main(args: Array[String]) {
      var lnew = Rdup(List(1, 1, 1, 2))
      Imprimir(lnew)
      lnew = Rdup(List(1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 1, 2, 9))
      Imprimir (lnew)
  }
  
}