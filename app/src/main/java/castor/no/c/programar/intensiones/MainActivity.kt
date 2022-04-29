package castor.no.c.programar.intensiones

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnV1 = findViewById<Button>(R.id.btnVentana1)
        val btnSitio = findViewById<Button>(R.id.btnGoogle)
        val btnV2 = findViewById<Button>(R.id.btnVentana2)

        btnSitio.setOnClickListener{
            Log.e("INTENT GOOGLE", "Presionaste krnal")
            val aGoogle = Intent(android.content.Intent.ACTION_VIEW)
            aGoogle.data = Uri.parse("http://google.com.mx")
            startActivity(aGoogle)
        }

        btnV1.setOnClickListener{
            Log.e("INTENT", "Presionaste crack")
            val intent1 = Intent(this, ImagenActivity::class.java)
            startActivity(intent1)
        }

        btnV2.setOnClickListener{
            Log.e("INTENT SUMA", "Presionaste master")
            val intent2 = Intent(this, Suma::class.java)
            startActivity(intent2)
        }
    }
}