package org.birchavenue.eway

import scalaxb._
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import dispatch._, Defaults._

trait eWayDispatchHttpClients extends HttpClients {
  val key: String
  val password: String
  
  val httpClient = new eWayDispatchHttpClient {}

  trait eWayDispatchHttpClient extends HttpClient {
    import dispatch._

    private[this] val logger = LoggerFactory.getLogger(getClass().getName());
    def request(in: String, address: java.net.URI, headers: Map[String, String]): String = {
      val req = url(address.toString) << in <:< headers  as (key,password)
      logger.debug("REQUEST: " + in)
      val res = Http(req OK as.String)
      val out = res()
      logger.debug("RESPONSE: " + out)
      out
    }
  }
}
