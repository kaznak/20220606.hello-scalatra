package com.github.kaznak.lib

import org.scalatra.test.scalatest.ScalatraFunSuite

class ConfigTests extends ScalatraFunSuite {
  val serverConfig: ServerConfig = Config.load(None)

  test("value must be loaded") {
    assert(serverConfig.hiThereMessage.endsWith("Hi there!"))
  }
}
