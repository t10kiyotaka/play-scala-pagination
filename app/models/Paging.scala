package models

case class Paging(
  page: Long,
  count: Long,
  total: Long,
  limit: Long
) {
  def isFirst() = ???

  def isLast() = ???

  def hasNext() = ???

  def hasPrev() = ???

}
