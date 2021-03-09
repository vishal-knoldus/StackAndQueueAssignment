package com.knoldus.main.Question3
/*
* Implementation of QUEUE in which I will define four methods
* 1.enQueue: Adds all the elements to the queue.
* 2.deQueue: Returns the first element in the queue
* 3.frontOfQueue: Returns the first element in the queue.
* 4.displayQueue: To display all the elements in the Queue
* */
object Queue {
  var list : List[Int] = Nil
  def enQueue(element :Int) : List[Int] = {
    list = list :+element
    list
  }
  def deQueue()={
    if(list.isEmpty)
      println("Queue is Empty")
    else
      list = list.tail
  }
  def frontOfQueue() :Unit  ={
    if(list.isEmpty)
      println("Nothing in the Queue")
    else
      println("Front value of the Queue is " + list.head)
  }
  def displayQueue():Unit={
    if(list.isEmpty) println("There is no elements present in the Queue")
    else {
      println("Elements of Queue are : ")
      val sizeOfList = list.size - 1
      for (i <- 0 to  sizeOfList)
        print(list(i) + " ")
      println()
    }
  }

  def main(args: Array[String]): Unit = {
    enQueue(4)
    enQueue(3)
    enQueue(8)
    enQueue(5)
    displayQueue()
    deQueue()
    deQueue()
    deQueue()
    deQueue()
    frontOfQueue()
  }
}
