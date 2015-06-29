package module

import play.api.Configuration
import scaldi.Module
import scaldi.play.condition._
import service._

/**
 * Author: yanyang.wang
 * Date: 23/04/2015
 */
class UserModule extends Module {
  lazy val config = inject[Configuration]
  bind[MessageService] when (inDevMode or inTestMode) to new SimpleMessageService
  bind[MessageService] when inProdMode to new OfficialMessageService

  bind[Service] identifiedBy required('test1) to new TestService(inject[Int](identified by "test.p1"), config.getInt("test.p2"))

  bind[Service] identifiedBy required('test1) to new TestService(inject[Int](identified by "test.p2"), config.getInt("test.p1"))

}