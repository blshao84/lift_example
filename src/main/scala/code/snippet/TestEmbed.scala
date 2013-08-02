package code.snippet
import scala.xml._
import net.liftweb.util.Helpers._
import net.liftweb.http._

object TestEmbed{
  def render1 = "#msg" #> "TestEmbed.render1"
  def render2 = "#msg" #> "TestEmbed.render2"
}