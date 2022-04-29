package castor.no.c.programar.intensiones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Suma : AppCompatActivity() {
    lateinit var editNum1:EditText
    lateinit var editNum2:EditText
    lateinit var txtResultado:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma)

        editNum1 = findViewById(R.id.editNum1)
        editNum2 = findViewById(R.id.editNum2)
        txtResultado = findViewById(R.id.txtRes)

    }

    fun operacion(view:View){
        var res:Int
        val num1 = editNum1.text.toString().toInt()
        val num2 = editNum2.text.toString().toInt()
        res = num1+num2
        txtResultado.text = "El resultado es: $res"
    }
}