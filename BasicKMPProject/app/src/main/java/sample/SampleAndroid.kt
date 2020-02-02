package sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

actual fun platformName(): String = "Android"

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    findViewById<TextView>(R.id.main_text).text = createApplicationScreenMessage()
  }
}