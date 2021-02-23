import com.badlogic.gdx.Game


/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
class SS15 extends Game {
  override def create(): Unit = {
    setScreen(new FirstScreen)
  }
}