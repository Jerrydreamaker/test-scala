object TestFuncAndMethod {
  /**
    * 将方法传入函数
    * @param f
    * @return
    */
  def m1(f:(Int,Int)=>Int)=f(1,2)
  val f1=(x:Int,y:Int)=>x+y
  def main(args: Array[String]): Unit = {
    println(m1(f1))
  }
}
