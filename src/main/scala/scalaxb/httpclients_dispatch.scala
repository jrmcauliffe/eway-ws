package scalaxb

import dispatch._, Defaults._

trait DispatchHttpClients extends HttpClients {
  lazy val httpClient = new DispatchHttpClient {}

  trait DispatchHttpClient extends HttpClient {
    import dispatch._
    val http = new Http()
    
    def request(in: String, address: java.net.URI, headers: Map[String, String]): String = {
      val req = url(address.toString) << in <:< headers
      val s = http(req > as.String)
      s()
    }
  }
}
