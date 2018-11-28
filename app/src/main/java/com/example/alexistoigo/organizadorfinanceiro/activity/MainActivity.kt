package com.example.alexistoigo.organizadorfinanceiro.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.alexistoigo.organizadorfinanceiro.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //setContentView(R.layout.intro_cadastro)
        setContentView(R.layout.activity_tela_principal)


        /*fun btEntrar (view: View){
            val intent = Intent(this, LoginActivity::class.java)
            val message = editText_main!!.text.toString()

            intent.putExtra(EXTRA_MESSAGE, message)
            startActivityForResult(intent, TEXT_REQUEST)

        }
a

        fun btCadastrar (view: View){
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }*/

        fun adicionarReceita(view: View) {

        }

        fun adicionarDespesa(view: View) {

        }

        fun about(view: View) {

        }


    }
}
