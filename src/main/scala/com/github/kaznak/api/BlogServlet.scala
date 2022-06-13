package com.github.kaznak.api

import com.github.kaznak.lib.{Logging, ServerConfig}
import org.scalatra._

class BlogServlet(
    val serverConfig: ServerConfig
) extends ScalatraServlet
    with Logging {

  get("/") {
    views.html.hello()
  }

  get("/hi-there") {
    serverConfig.hiThereMessage
  }

}
