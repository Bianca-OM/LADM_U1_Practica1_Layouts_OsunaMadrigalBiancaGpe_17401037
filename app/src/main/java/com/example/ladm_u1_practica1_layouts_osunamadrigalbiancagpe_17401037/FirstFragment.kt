package com.example.ladm_u1_practica1_layouts_osunamadrigalbiancagpe_17401037

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.example.ladm_u1_practica1_layouts_osunamadrigalbiancagpe_17401037.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lsmenu.setOnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    AlertDialog.Builder(requireActivity())
                        .setTitle("Pizza")
                        .setMessage("Tamaño: Familiar \n"+"Precio: $120.00")
                        .setNegativeButton("ACEPTAR", { d, i -> d.dismiss() })
                        .show()
                }
                1 -> {
                    AlertDialog.Builder(requireActivity())
                        .setTitle("Pasta")
                        .setMessage("Tamaño: Individual \n"+"Precio: $50.00")
                        .setNegativeButton("ACEPTAR", { d, i -> d.dismiss() })
                        .show()
                }
                2 -> {
                    AlertDialog.Builder(requireActivity())
                        .setTitle("Burritos")
                        .setMessage("Cantidad: 3 \n"+"Precio: $40.00")
                        .setNegativeButton("ACEPTAR", { d, i -> d.dismiss() })
                        .show()
                }
                3 -> {
                    AlertDialog.Builder(requireActivity())
                        .setTitle("Hot Cakes")
                        .setMessage("Cantidad: 3 \n"+"Precio: $60.00")
                        .setNegativeButton("ACEPTAR", { d, i -> d.dismiss() })
                        .show()
                }
                4 -> {
                    AlertDialog.Builder(requireActivity())
                        .setTitle("Papas")
                        .setMessage("Tamaño: Mediano \n"+"Precio: $25.00")
                        .setNegativeButton("ACEPTAR", { d, i -> d.dismiss() })
                        .show()
                }
                5 -> {
                    AlertDialog.Builder(requireActivity())
                        .setTitle("Pan Dulce")
                        .setMessage("Cantidad: 1 \n"+"Precio: $5.00")
                        .setNegativeButton("ACEPTAR", { d, i -> d.dismiss() })
                        .show()
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}