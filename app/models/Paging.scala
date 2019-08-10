package models

case class Paging(
  page:                Long,
  itemCountOfThisPage: Long,
  totalCount:          Long,
  limitPerPage:        Long
) {
  val prevPage: Long = page - 1
  val nextPage: Long = page + 1

  def lastPage: Long =
    Math.ceil(totalCount / limitPerPage).toLong

  def isFirst: Boolean =
    if(page == 1) true else false

  def isLast: Boolean =
    if(lastPage == page) true else false

  def hasNext: Boolean =
    if(!isLast) true else false

  def hasPrev: Boolean =
    if(page > 1 && lastPage > 1) true else false



}
