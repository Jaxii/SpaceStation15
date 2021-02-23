import com.badlogic.gdx.backends.lwjgl3.{Lwjgl3Application, Lwjgl3ApplicationConfiguration}


/** Launches the desktop (LWJGL3) application. */
object Lwjgl3Launcher {
  def main(args: Array[String]): Unit = {
    createApplication
  }

  private def createApplication = new Lwjgl3Application(new SS15, getDefaultConfiguration)

  private def getDefaultConfiguration = {
    val configuration = new Lwjgl3ApplicationConfiguration
    configuration.setTitle("SS15")
    configuration.setWindowedMode(640, 480)
    configuration.setWindowIcon("libgdx128.png", "libgdx64.png", "libgdx32.png", "libgdx16.png")
    configuration
  }
}