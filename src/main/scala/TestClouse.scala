object TestClouse {

  var factor=3

  def main(args: Array[String]): Unit = {
    println(addFactor(2))
  }

  def addOne(x:Int) :Int={
    x+1;
  }

  val addFactor=(x:Int)=>x+factor

  //实现了序列化接口
  println(addFactor.isInstanceOf[Serializable])
}
