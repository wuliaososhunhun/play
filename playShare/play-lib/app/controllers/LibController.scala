package controllers

import play.api.mvc._

class LibController extends Controller {

  def index = Action {
    Ok(views.html.libindex("lib is great"))
  }
}