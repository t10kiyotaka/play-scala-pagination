package models

case class Cursor(offset: Option[Long] = None, limit: Option[Long] = None)
