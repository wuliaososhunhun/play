package controllers

import play.api.mvc._
import service.Service

class TestController(val service: Service) extends Controller {

  def index(user: String) = Action {
    service.doJob()
    service.status()
    Ok(views.html.index("good: " + user))
  }
}