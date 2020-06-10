package vinkoviljevac.ferit.rmalv5

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bee = MediaPlayer.create(this, R.raw.bee)
        var birds = MediaPlayer.create(this, R.raw.birds)
        var poker = MediaPlayer.create(this, R.raw.poker)
        beeButton.setOnClickListener(){
        bee.start()
        }
        birdButton.setOnClickListener(){
            birds.start()
        }
        pokerButton.setOnClickListener(){
            poker.start()
        }
    }
}
