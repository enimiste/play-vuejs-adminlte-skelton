package controllers

import javax.inject._

import play.api.db.Database
import play.api.mvc._
import scalikejdbc._

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {


  def index() = Action {
    DB.readOnly { implicit session =>
      sql"select name from tests".toMap.list.apply().foreach(println)
      Ok(views.html.index())
    }

  }

  def home() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.home(request))
  }

  def lorem() = Action {
    Ok(views.html.lorem())
  }

  def xml = Action {
    Ok(<message>This is a message</message>)
  }
}
