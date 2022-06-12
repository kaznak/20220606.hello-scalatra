import com.github.kaznak._
import org.scalatra._
import javax.servlet.ServletContext

import com.github.kaznak.util.Config

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext): Unit = {
    val serverConfig = Config.load(None)
    context.mount(new BlogServlet(serverConfig), "/*")
  }
}
