object TestWhile {
  /**
    * 同 java
    * 不支持 i-- , i++
    * @param args
    */
  def main(args: Array[String]): Unit = {
    var n=10
    while (n>=0){
      println(n)
      n-=1
    }
  }

}
