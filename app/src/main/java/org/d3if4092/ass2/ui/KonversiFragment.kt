package org.d3if4092.ass2.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import org.d3if4092.ass2.R
import org.d3if4092.ass2.databinding.FragmentKonversiBinding

class KonversiFragment : Fragment() {

    private lateinit var binding: FragmentKonversiBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKonversiBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button.setOnClickListener { konversi() }
        binding.button3.setOnClickListener { reset() }
    }


    @SuppressLint("StringFormatMatches")
    private fun konversi() {


        val jumlah = binding.namaInp.text.toString()
        if (TextUtils.isEmpty(jumlah)) {
            Toast.makeText(context, R.string.jumlah_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val hasil = jumlah.toFloat() / 132

        binding.jumlahTextView.text = getString(R.string.jumlah_x, hasil)

    }

    private fun reset() {
        binding.namaInp.setText("")
        binding.jumlahTextView.text = ""

    }

    }













