package kt.evaprojects.cum.unex.es.intercambiagram

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Loginmain.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        registrarse.setOnClickListener {
            startActivity(Intent(this, registrarseActivity::class.java))
        }
    }
}
