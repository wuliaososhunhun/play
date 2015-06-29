package service

/**
 * Author: yanyang.wang
 * Date: 23/04/2015
 */
trait Service {
  def doJob(): Unit

  def status(): Unit
}
