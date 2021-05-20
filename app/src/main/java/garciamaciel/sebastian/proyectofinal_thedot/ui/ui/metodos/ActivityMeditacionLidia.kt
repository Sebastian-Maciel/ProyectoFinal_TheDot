package garciamaciel.sebastian.proyectofinal_thedot.ui.ui.metodos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import garciamaciel.sebastian.proyectofinal_thedot.R

class ActivityMeditacionLidia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditacion_lidia)
        supportActionBar?.hide()
        val btnRegresar: ImageButton = findViewById(R.id.btnRegresarL) as ImageButton
        btnRegresar.setOnClickListener{
            var intent: Intent = Intent(this, ActivityMeditacion::class.java)
            startActivity(intent)
        }
    }
}