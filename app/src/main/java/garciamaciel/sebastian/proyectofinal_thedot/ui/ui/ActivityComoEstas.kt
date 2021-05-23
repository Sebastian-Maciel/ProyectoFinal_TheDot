package garciamaciel.sebastian.proyectofinal_thedot.ui.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import garciamaciel.sebastian.proyectofinal_thedot.R

class ActivityComoEstas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_como_estas)
        /*Oculta la action bar*/
        supportActionBar?.hide()

        val botonRegresar:ImageButton = findViewById<ImageButton>(R.id.boton_regresar_como_estas)


        botonRegresar.setOnClickListener() {
            var intent: Intent = Intent(this, Journal::class.java)
            startActivity(intent)
        }
    }
}