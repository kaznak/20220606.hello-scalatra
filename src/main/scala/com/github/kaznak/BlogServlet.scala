package com.github.kaznak

import org.scalatra._
import com.github.kaznak.Logging
import com.github.kaznak.util.ServerConfig

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
