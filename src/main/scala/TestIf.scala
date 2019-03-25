object TestIf {
  def main(args: Array[String]): Unit = {
    /*
    val x=1
    val y= if(x==1) 1 else 0
    println(y)*/
    /**
      * 支持混合类型的条件表达式
      */
    /*
    val x=2
    val y= if(x==1) 1 else "error"
    println(y)
    */
    /**
      * 没有 else
      */
    /*
    val x=2
    val y= if(x==1) 1
    println(y)
    */
    /**
      * else if
      */
    /*
    val x=2
    val y= if(x==1) 1 else if(x==2) 2 else 3
    println(y)*/

    /**
      * 快表达式
      */

    val x=2
    val y= {
      if(x==1)
        1
      else if(x==2)
        2
      else
        3
    }
    println(y)

  }
}
