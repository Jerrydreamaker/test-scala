/**
  * Option 可视为一个容器，这个容器中要么有东西，要么没有东西。
  * 子类：Some,表示有且仅有一个东西。
  * None，表示空容器。
  * 可以被当成集合来看待。
  */
object TestOption {
  def main(args: Array[String]): Unit = {
    //val x=None,等同于下
    val x=Option(null)
    //报错
    //x.get
    println("x:"+x.getOrElse("test"))
    //val y=Some("some"),等同于下
    val y=Option("some")
    println("y:"+y.get)
    //当成集合使用
    x.map(println(_))
    y.map(println(_))
    // for 循环
    for (y1<-y){
      println(y1)
    }
  }


}
