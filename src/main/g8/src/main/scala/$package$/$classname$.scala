package $package$

import org.http4s._
import org.http4s.dsl._
import org.http4s.server.ServerApp
import org.http4s.server.blaze.BlazeBuilder

object $classname$ extends ServerApp {

  val service = HttpService {
    case req@GET -> Root =>
      Ok("Hello World!")
  }

  def server(args: List[String]) = BlazeBuilder.bindHttp(8080)
    .mountService(service, "/")
    .start
}
