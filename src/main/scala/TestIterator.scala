/**
  * Iterator 对象只能遍历一次
  */
object TestIterator {
  def main(args: Array[String]): Unit = {
    val ite=Iterator("A","B")
    /*
    while (ite.hasNext){
      println(ite.next)
    }*/
    /**
      * test map
      */
    /*
    val ite1=ite.map(_+"test")
    ite1.foreach(println)
    */
    /**
      * test flatMap
      */
    /*
    val ite2=ite.flatMap(_.toCharArray)
    ite2.foreach(println)
    */
    /**
      * test filter
      */
    /*
    val ite3=ite.filter(_.contains("A"))
    ite3.foreach(println)
    */
    /**
      * test zipWiteIndex
      */
    /*
    val ite4=ite.zipWithIndex
    ite4.foreach(println)
    */
    /**
      * test zip
      */
    /*
    val ite5=Iterator(1,2,3)
    val ite6=ite.zip(ite5)
    ite6.foreach(println)*/

  }
}
