import sbt.Project.Setting
import sbt.{AutoPlugin, _}

object PlayIt extends AutoPlugin {

  object autoImport {

    val loud = settingKey[Boolean]("loud")
    val play = taskKey[Unit]("playIt")

  }

  import autoImport._

  override def projectSettings: Seq[Setting[_]] = Seq(
    play := playThis.value
  )

  lazy val playThis =
    Def.task {
      AudioPlayerWrapper.play()
    }
}
