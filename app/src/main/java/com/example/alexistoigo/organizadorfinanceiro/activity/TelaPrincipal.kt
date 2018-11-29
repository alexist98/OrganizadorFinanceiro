package com.example.alexistoigo.organizadorfinanceiro.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import com.example.alexistoigo.organizadorfinanceiro.R

import kotlinx.android.synthetic.main.activity_tela_principal.*

class TelaPrincipal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        fun adicionarReceita(view: View) {
            val intent = Intent(this, ReceitasActivity::class.java)
            startActivity(intent)
        }

        fun adicionarDespesa(view: View) {

        }

        fun about(view: View) {

        }
    }

}
