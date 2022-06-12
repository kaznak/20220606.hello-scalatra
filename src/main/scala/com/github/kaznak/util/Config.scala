package com.github.kaznak.util

import pureconfig.ConfigSource
import pureconfig.ConfigSource.resources
import pureconfig.error.ConfigReaderFailures

class ConfigException(failures: ConfigReaderFailures)
    extends Exception(failures.prettyPrint())

case class ServerConfig(
    hiThereMessage: String
)

object Config {
  import pureconfig.generic.auto._
  def load(name: Option[String]): ServerConfig = {
    val configObjSrc = name match {
      case Some(c) =>
        ConfigSource.default(resources(c))
      case None =>
        ConfigSource.default
    }
    configObjSrc.load[ServerConfig] match {
      case Right(c) => c
      case Left(e)  => throw new ConfigException(e)
    }
  }
}
