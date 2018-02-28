package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.db.Database

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(db: Database, cc: ControllerComponents) extends AbstractController(cc) {

 
  def index() = Action { implicit request: Request[AnyContent] =>
     db withConnection { conn =>
        val stmt = conn.createStatement
        val rs = stmt.executeQuery("SELECT name FROM tests")

        while (rs.next()) {
          println(rs.getString("name"))
        }
      }
      Ok(views.html.index())
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
