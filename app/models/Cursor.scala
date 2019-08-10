package models

case class Cursor(offset: Long = 0L, limit: Option[Long] = None)
