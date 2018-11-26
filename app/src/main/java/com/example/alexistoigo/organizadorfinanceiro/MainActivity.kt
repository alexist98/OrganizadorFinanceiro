package com.example.alexistoigo.organizadorfinanceiro

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.alexistoigo.organizadorfinanceiro.activity.CadastroActivity
import com.example.alexistoigo.organizadorfinanceiro.activity.LoginActivity
import java.nio.file.attribute.AclFileAttributeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_cadastro)
        //setContentView(R.layout.activity_main)


        /*fun btEntrar (view: View){
            startActivity( Intent(this, LoginActivity.class))

        }
        fun btCadastrar (view: View){
            startActivity(Intent(this, CadastroActivity.class))

        }*/
    }
}
