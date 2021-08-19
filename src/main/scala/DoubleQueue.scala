import scala.collection.mutable.ListBuffer
trait Queue{
  var bufferItem = new ListBuffer[Int]()
  def enqueue(item:Int)
  def dequeue(): Unit ={
    bufferItem.remove(0)
    val list =bufferItem.toList
    println(list)
  }
}
class DoubleQueue extends Queue {
  override def enqueue(item:Int): Unit = {
    bufferItem+=item*2
    val list = bufferItem.toList
    println(list)
  }
}
class SquareQueue extends Queue {
  override def enqueue(item:Int): Unit = {
    bufferItem+=item*item
    val list = bufferItem.toList
    println(list)
  }
}
object AssignmetOOPs {
  def main(args: Array[String]): Unit = {
    val doubleQueue = new DoubleQueue()
    val squareQueue = new SquareQueue()
    doubleQueue.enqueue(3)
    doubleQueue.enqueue(5)
    doubleQueue.enqueue(7)
    doubleQueue.enqueue(6)
    squareQueue.enqueue(2)
    doubleQueue.dequeue()
    doubleQueue.dequeue()
  }
}