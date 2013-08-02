package code.snippet
import scala.xml._
import net.liftweb.util.Helpers._
import net.liftweb.http._


object ChooseSurround{
  def render = "#main [data-lift]" #> "surround?with=default;at=content"
}
