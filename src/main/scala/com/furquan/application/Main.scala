package com.furquan.application

import com.furquan.model.Employee

object Main {
  def main(args: Array[String]): Unit = {
    val employee = Employee("Furquan", 60)
    println(s"Hello ${employee.name}")
  }
}
