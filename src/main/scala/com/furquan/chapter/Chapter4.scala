package com.furquan.chapter

class Chapter4 {
  var markSum: Int = 0
  var markCount: Int = 0
  var highestMark: Int = Int.MinValue
  var lowestMark: Int = Int.MaxValue

  def averageMark(): Double = {
    markSum.toDouble/markCount
  }

  def markExam(q1: Double, q2: Double, q3: Double) : Int = {
    val averageMarks = (q1 + q2 + q3) / 3
    val scaledScore = averageMarks * 10 / 3
    val mark = Math.round(scaledScore).toInt

    if(mark < lowestMark) {
      lowestMark = mark
    }
    if(mark > highestMark) {
      highestMark = mark
    }

    markSum += mark
    markCount += 1
    mark
  }
}

object Chapter4 {
  def main(args: Array[String]): Unit = {
    val ch4 = new Chapter4()
    println(s"first round : ${ch4.markExam(2,3,2)}")
    println(s"average Marks: ${ch4.averageMark()}")
    println(s"second round : ${ch4.markExam(3,3,3)}")
    println(s"average Marks: ${ch4.averageMark()}")
    println(s"third round : ${ch4.markExam(3,2.1,1.3)}")
    println(s"average Marks: ${ch4.averageMark()}")
    println(s"highest mark: ${ch4.highestMark}")
    println(s"lowest mark: ${ch4.lowestMark}")
  }
}