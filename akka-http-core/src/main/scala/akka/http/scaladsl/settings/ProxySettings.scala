package akka.http.scaladsl.settings

final case class ProxySettings(
  host:          String,
  port:          Int,
  nonProxyHosts: Seq[String])
