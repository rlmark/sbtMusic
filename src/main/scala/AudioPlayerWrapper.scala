
object AudioPlayerWrapper {

  import java.io.FileInputStream

  import sun.audio.{AudioPlayer, AudioStream}

  def play() {
//    val path = "/Users/rebeccamark/Downloads/01 Mi Secreto.wav"
    val path = "/Users/rebeccamark/Downloads/Screenshot.wav"
    val streamFromPath: FileInputStream = new FileInputStream(path)
    AudioPlayer.player.start(new AudioStream(streamFromPath))
  }

  def playFromResource(): Unit = {
    // todo: figure out this part
    val stream = getClass.getResourceAsStream("/01 Mi Secreto.wav")
    AudioPlayer.player.start(new AudioStream(stream))
  }

  def main(args: Array[String]): Unit = {
    play()
  }

}
