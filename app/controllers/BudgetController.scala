package controllers;

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton 
class BudgetController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def budget = Action { implicit request: Request[AnyContent] => Ok("Budget")};
}