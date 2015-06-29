package system

import module.{UserModule, WebModule}
import play.api.{Application, Configuration, GlobalSettings}
import scaldi.play.ScaldiSupport
import service.Service

/**
 * Author: yanyang.wang
 * Date: 23/04/2015
 */
object Global extends GlobalSettings with ScaldiSupport {
  def applicationModule = new WebModule :: new UserModule

  override def onStart(app: Application) = {
    super.onStart(app)

    println("load Global start")
    inject[Service]('test1).status()
    println("Load lib config success: " + inject[Configuration].getBoolean("lib.test") )
  }
}


