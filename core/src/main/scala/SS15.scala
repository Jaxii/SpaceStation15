import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import SS15._
import com.badlogic.gdx.{Game, Gdx, Screen}
import com.badlogic.gdx.utils.ScreenUtils
import com.badlogic.gdx.graphics.{Camera, OrthographicCamera, Texture}
import com.badlogic.gdx.maps.ImageResolver.AssetManagerImageResolver
import com.badlogic.gdx.maps.tiled.{TiledMap, TiledMapTile, TiledMapTileLayer}
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer.Cell
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer
import com.badlogic.gdx.maps.tiled.TiledMap
import com.badlogic.gdx.assets.loaders.resolvers.ExternalFileHandleResolver
import com.badlogic.gdx.graphics.g3d.particles.ParticleSorter.None
import com.badlogic.gdx.maps.tiled.TiledMap
import com.badlogic.gdx.maps.tiled.TmxMapLoader
import com.badlogic.gdx.maps.MapLayer
import com.badlogic.gdx.maps.tiled.TiledMap
import com.badlogic.gdx.maps.tiled.TmxMapLoader

import scala.collection.immutable.List
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future




object SS15  {

  var map: TiledMap = new TmxMapLoader().load("maps/space.tmx")

  var camera: OrthographicCamera = new OrthographicCamera
  (
    Gdx.graphics.getWidth, Gdx.graphics.getHeight
  )

  val renderer: OrthogonalTiledMapRenderer = new OrthogonalTiledMapRenderer(map)

}
class SS15 extends Game {

  override def create(): Unit = {
    camera.update()
  }

  def render(delta: Float): Unit = {
    // Draw your screen here. "delta" is the time since last render in seconds.

    camera.update()
    renderer.setView(camera)
    renderer.render()

  }

  override def resize(width: Int, height: Int): Unit = {
    // Resize your screen here. The parameters represent the new window size
  }

  override def pause(): Unit = {
    // Invoked when your application is paused.
  }

  override def resume(): Unit = {
    // Invoked when your application is resumed after pause.
  }


  override def dispose(): Unit = {
    // Destroy screen's assets here.
   List( map, renderer).foreach(x => x.dispose())


    //Does disposing the singleton object destroy all of its values?
  }
}