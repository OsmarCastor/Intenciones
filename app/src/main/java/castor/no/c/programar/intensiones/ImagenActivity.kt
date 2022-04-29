package castor.no.c.programar.intensiones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ImagenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagen)

        val btnr = findViewById<Button>(R.id.btnRegresar)

        btnr.setOnClickListener{
            Log.e("INTENT REGRESAR", "Presionaste maistro")
            finish()
        }
    }
}