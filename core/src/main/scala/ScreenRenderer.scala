import com.badlogic.gdx.Screen


/** First screen of the application. Displayed after the application is created. */
class FirstScreen extends Screen {
  override def show(): Unit = {
    // Prepare your screen here.
  }

  override def render(delta: Float): Unit = {
    // Draw your screen here. "delta" is the time since last render in seconds.
  }

  override def resize(width: Int, height: Int): Unit = {
    // Resize your screen here. The parameters represent the new window size.
  }

  override def pause(): Unit = {
    // Invoked when your application is paused.
  }

  override def resume(): Unit = {
    // Invoked when your application is resumed after pause.
  }

  override def hide(): Unit = {
    // This method is called when another screen replaces this one.
  }

  override def dispose(): Unit = {
    // Destroy screen's assets here.
  }
}