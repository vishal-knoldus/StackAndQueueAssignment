package com.knoldus.main.Question3
/*
* Implementation of Stack in which I have define Four method
* 1.PUSH : Inserting elements in stack
* 2.POP : Deleting element from the stack
* 3.DISPLAY: To display all the elements in the Stack
* 4.PEEK : Top of the stack
* */
object Stack {

 var list : List[Int] = Nil

  def pushInStack(element : Int):Unit={

   list = list :+ element // Here, element will add in  last of the list and assign to list
  }
  def popFromStack()={
    if(list.isEmpty)
      println("Stack is underflow")
    else
      list = list.dropRight(1)    //The dropRight(1) method is utilized to find all the elements of the list except the last 1 elements
  }
  def peekOfStack():Unit ={
    val updatedSize : Int = list.size
    if(list.isEmpty)
      println("There is no elements in the stack")
    else
      println("Peeks of stack is : "+list(updatedSize - 1))

  }
  def displayStack():Unit={
    val sizeForCount : Int = list.size - 1
    if(list.isEmpty)
      println("Stack is Empty")
    else{
      printf("Elements of stack are ")
      for( i <- 0 to sizeForCount) {
        printf(list(i) + " ")
      }
      println()
    }

  }
  def main(args: Array[String]): Unit = {
    pushInStack(5)
    pushInStack(4)
    pushInStack(2)
    displayStack()
    popFromStack()
    popFromStack()
    popFromStack()
    pushInStack(18)
    displayStack()
    peekOfStack()
  }

}
