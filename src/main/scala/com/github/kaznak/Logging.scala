package com.github.kaznak

import com.typesafe.scalalogging.Logger

trait Logging {
  protected val logger: Logger = Logger(getClass)
  logger.debug("logger initialized.")
}
