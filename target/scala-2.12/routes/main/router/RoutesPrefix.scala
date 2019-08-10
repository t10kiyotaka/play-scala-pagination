// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kiyotaka/practice/Play/play-scala-slick-example/conf/routes
// @DATE:Fri Jun 21 23:41:31 JST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
