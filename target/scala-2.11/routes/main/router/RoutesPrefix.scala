
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rocker/Play Framework/akkaactorsscheduler/conf/routes
// @DATE:Sat Jun 17 22:47:08 IST 2017


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
