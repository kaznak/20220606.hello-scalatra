package com.github.kaznak

import com.github.kaznak.util.{Config, ServerConfig}
import org.scalatra.test.scalatest.ScalatraFunSuite

class ConfigTests extends ScalatraFunSuite {
  val serverConfig: ServerConfig = Config.load(None)

  test("value must be loaded") {
    assert(serverConfig.hiThereMessage.endsWith("Hi there!"))
  }
}
