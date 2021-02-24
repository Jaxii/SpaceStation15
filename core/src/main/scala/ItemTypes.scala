import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite

object ItemType {

  trait pickUpable { def pickUp(): Unit = ??? } //todo: add to playerInventory when clicked
  trait stackable { val max: Int = 250} //todo
  trait placeable {} //todo

  //object Bullet extends pickUpable {}
  object Ammo extends pickUpable
  {
    //todo: sprites..
    final case class Caliber50(sprite: Sprite, damage: 10)
    final case class Caliber22(sprite: Sprite, damage: 7)
  }
  object FloorTile extends stackable with pickUpable with placeable {
    //final case class SteelTile(sprite: Texture= new Texture(Gdx.files.internal("steelTile.png"))) {}
  }
  object Gun {
    final case class LR(sprite: Sprite)
  }
}
