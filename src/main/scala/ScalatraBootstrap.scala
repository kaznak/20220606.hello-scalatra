import com.github.kaznak.api.BlogServlet
import org.scalatra._
import javax.servlet.ServletContext

import com.github.kaznak.lib.Config

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext): Unit = {
    val serverConfig = Config.load(None)
    context.mount(new BlogServlet(serverConfig), "/*")
  }
}
