package com.example.ladm_u1_practica1_layouts_osunamadrigalbiancagpe_17401037

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        this.setTitle("NUEVA ORDEN")

        btnordenar.setOnClickListener {

            if(txtnombre.text.isEmpty() || txttelefono.text.isEmpty() ||
                    txtdireccion.text.isEmpty()){
                AlertDialog.Builder(this)
                    .setTitle("ERROR")
                    .setMessage("Debe llenar todos los campos")
                    .setNegativeButton("OK", { d, i -> d.dismiss() })
                    .show()
            }else {
                val nombre = txtnombre.text.toString()
                val telefono = txttelefono.text.toString()
                val direccion = txtdireccion.text.toString()
                val platillo = spnrplatillo.selectedItem.toString()

                var cadena = "Orden registrada \n" + "Cliente: ${nombre} \n" +
                        "Telefono: ${telefono} \n" + "Direccion: ${direccion} \n" +
                        "Platillo: ${platillo}"

                AlertDialog.Builder(this)
                    .setTitle("RESUMEN DE ORDEN")
                    .setMessage(cadena)
                    .setNegativeButton("ACEPTAR", { d, i -> d.dismiss()
                        finish()
                    })
                    .show()
            }
        }

        btnregresar.setOnClickListener {
            finish()
        }
    }
}