package module

import controllers.{Application, LibController, TestController}
import play.api.Configuration
import scaldi.Module
import service.Service

/**
 * Author: yanyang.wang
 * Date: 23/04/2015
 */

class WebModule extends Module {
  lazy val config = inject[Configuration]
  binding to new Application

  binding to new TestController(inject[Service]('test1))

  binding to new LibController()
}
