package com.github.kaznak.util

import pureconfig.ConfigSource
import pureconfig.ConfigSource.resources
import pureconfig.error.ConfigReaderFailures

class ConfigException(failures: ConfigReaderFailures) extends Exception(failures.prettyPrint())

case class ServerConfig(
    hiThereMessage: String
)

object Config {
  import pureconfig.generic.auto._
  def load(name: Option[String]): ServerConfig =
    name match {
      case Some(config) =>
        ConfigSource.default(resources(config)).load[ServerConfig] match {
          case Right(c) => c
          case Left(es) => throw new ConfigException(es)
        }
      case None =>
        ConfigSource.default.load[ServerConfig] match {
          case Right(c) => c
          case Left(es) => throw new ConfigException(es)
        }
    }
}