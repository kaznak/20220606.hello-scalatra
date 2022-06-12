package com.github.kaznak

import org.scalatra.test.scalatest._
import com.github.kaznak.util.{Config, ServerConfig}

class BlogServletTests extends ScalatraFunSuite {
  val serverConfig: ServerConfig = Config.load(None)

  addServlet(new BlogServlet(serverConfig), "/*")

  test("GET / on BlogServlet should return status 200") {
    get("/") {
      status should equal(200)
    }
  }

  test(
    "GET /hi-there on BlogServlet should return the message in the configuration file"
  ) {
    get("/hi-there") {
      status should equal(200)
      response.body should equal(serverConfig.hiThereMessage)
    }
  }
}
