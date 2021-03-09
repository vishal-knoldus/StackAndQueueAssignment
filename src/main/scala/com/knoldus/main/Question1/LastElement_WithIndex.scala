package com.knoldus.main.Question1
object LastElement_WithIndex {

  def lastValueWithIndex(list : List[Any]) : Unit = {
   val index = list.size - 1
    println("Last Element of the list is " + list(index))
    println("Index of last element is " + index )
  }

  def main(args: Array[String]): Unit = {
    val list1=List(1,88,5,2,4)
    lastValueWithIndex(list1)
    val list2 = List("Abhay", "Vishal","Nehal Gupta", "Amit Bro")
    lastValueWithIndex(list2)
  }
}