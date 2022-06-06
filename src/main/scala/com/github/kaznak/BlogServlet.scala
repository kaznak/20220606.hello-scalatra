package com.github.kaznak

import org.scalatra._

class BlogServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

  get("/hi-there") {
    "Hi there!"
  }

}
