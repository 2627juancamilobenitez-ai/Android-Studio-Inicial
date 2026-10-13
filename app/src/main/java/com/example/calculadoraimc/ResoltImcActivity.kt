package com.example.calculadoraimc

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadoraimc.ImcCalculatorActivity.Companion.IMC_KEY

class ResoltImcActivity : AppCompatActivity() {


    private lateinit var tvResolt: TextView
    private lateinit var tvIMC: TextView
    private lateinit var Descripcion: TextView

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.resultimcactivity)
        val result = intent.extras?.getDouble(IMC_KEY) ?:  -1.0
        initComponents()
        initUi(result)
    }

    private fun initUi(result: Double){
        tvIMC.text = "%.2f".format(result)

        when{

        result < 18.5 -> { // Bajo peso
            tvResolt.text = getString(R.string.title_bajo_peso)
            Descripcion.text = getString(R.string.description_bajo_peso)
        }
        result < 25.0 -> { // Peso normal
            tvResolt.text = getString(R.string.title_peso_normal)
            Descripcion.text = getString(R.string.description_peso_normal)
        }
        result < 30.0 -> { // Sobrepeso
            tvResolt.text = getString(R.string.title_sobrepeso)
            Descripcion.text = getString(R.string.description_sobrepeso)
        }
        else -> { // Obesidad
            tvResolt.text = getString(R.string.title_obesidad)
            Descripcion.text = getString(R.string.description_obesidad)
        }
    }
    }


    private fun initComponents(){
        tvIMC = findViewById(R.id.tvIMC)
        tvResolt = findViewById(R.id.rvResult)
        Descripcion = findViewById(R.id.Description)


    }

}