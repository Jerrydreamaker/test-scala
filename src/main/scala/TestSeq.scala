import scala.collection.mutable.ArrayBuffer

object TestSeq {
  def main(args: Array[String]): Unit = {
    val strSeq=Seq.apply("A","B")
    println(strSeq)
    val intSeq=Seq(1,2)
    //传入 Lambda 表达式
    val intSeq1=intSeq.map(x=>x+1)
    println("intSeq1:"+intSeq1)
    /**
      * test map
      */
    // 传入函数
    val intSeq2=intSeq.map(addOne)
    println("intSeq2:"+intSeq2)
    //

    val intSeq3=intSeq.map(addTest)
    println("intSeq3:"+intSeq3)

    val intSeq4=intSeq.map(x=>"test"+x)
    println("intSeq4:"+intSeq4)

    // 元素只有一个成员，可以使用 _

    val intSeq5=intSeq.map("test"+_)
    println("intSeq5:"+intSeq5)

    /**
      * test flatMap
      */

    val intSeq6=intSeq.flatMap(0.to(_))
    println("intSeq6:"+intSeq6)

    val intSeq7=intSeq.flatMap(flatTest)
    println("intSeq7:"+intSeq7)


    /**
      * test filter
      */

    val intSeq8=intSeq.filter(_<2)
    println("intSeq8:"+intSeq8)

    /**
      * test reduce
      */
    val sum=intSeq.reduce((x,y)=>x+y)
    println("sum:"+sum)

    val sum1=intSeq.reduce(testSum)
    println("sum1:"+sum1)


    /**
      * test fold
      */
    val foldSum=intSeq.fold(1)((x,y)=>x+y)
    println("foldSum:"+foldSum)

    /**
      *foldLeft,一次遍历完成两个功能
      */
    val intSeq9=intSeq.foldLeft(ArrayBuffer.newBuilder[String])((arr,x)=>{
      if(x<2){
        arr+=("test"+x)
      }else{
        arr
      }
    })
    println("intSeq9:"+intSeq9)

    val intSeq10=intSeq.filter(_<2).map("test"+_)
    println("intSeq10:"+intSeq10)

    /**
      * test foreach,传入无输出函数。
      */
    intSeq.foreach(println(_))

    /**
      * test sorted,对 Seq 进行排序
      */
    val intSeq11=Seq(2,1)
    intSeq11.sorted
    println("intSeq11:"+intSeq11)

    /**
      * test zip,两个数组拼接
      */
    val intSeq12=intSeq.zip(strSeq)
    println("intSeq12:"+intSeq12)

    /**
      * zipWithIndex ,元素与索引拼接
      */
    val intSeq13=intSeq.zipWithIndex
    println("intSeq13:"+intSeq13)






  }

  def addOne(x:Int) :Int={
    x+1;
  }

  def addTest(x:Int) :String={
    "test"+x;
  }

  def flatTest(x:Int) :Seq[Int]={
    0.to(x)
  }

  def testSum(x:Int,y:Int):Int={
    x+y
  }



}
