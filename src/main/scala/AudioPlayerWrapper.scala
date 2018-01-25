
object AudioPlayerWrapper {

  import java.io.FileInputStream

  import sun.audio.{AudioPlayer, AudioStream}

  def play() {
//    val path = "/Users/rebeccamark/Downloads/01 Mi Secreto.wav"
    val path = "/home/rmark/Downloads/LoadScript.wav"
    val streamFromPath: FileInputStream = new FileInputStream(path)
    AudioPlayer.player.start(new AudioStream(streamFromPath))
  }

  def playFromResource(): Unit = {
    // todo: figure out this part
    val stream = getClass.getResourceAsStream("/01 Mi Secreto.wav")
    AudioPlayer.player.start(new AudioStream(stream))
  }

  // todo: mp3 player

  def main(args: Array[String]): Unit = {
    play()
  }

}
