package com.github.kaznak.lib

import com.typesafe.scalalogging.Logger

trait Logging {
  protected val logger: Logger = Logger(getClass)
  logger.debug("logger initialized.")
}
