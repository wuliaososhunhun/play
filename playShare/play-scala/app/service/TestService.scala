package service

/**
 * Author: yanyang.wang
 * Date: 23/04/2015
 */
class TestService(var p1: Int, val p2: Option[Int]) extends Service {
  def doJob(): Unit = {
    println("working...")
  }

  def status(): Unit = {
    println(s"p1 = $p1 and p2 = $p2")
  }
}
