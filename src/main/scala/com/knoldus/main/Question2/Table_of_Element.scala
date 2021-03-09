package com.knoldus.main.Question2
object Table_of_Element{

  def table(list : List[Int]) : Unit ={

  for(index <- (0 to list.size -1)){

    println("Table of " + list(index) +" is ")


    for(count <- 1 to 10){

      println(list(index)+ " * " + count +" = " +list(index) * count)

    }
    println("\n")
  }

  }

  def main(args: Array[String]): Unit = {
    val list = List(5,6)
    table(list)
  }
}