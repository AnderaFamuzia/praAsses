package com.example.praapp


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class persegiPanjang : Fragment() {

    @SuppressLint("StringFormatInvalid")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        b_hitung.setOnClickListener {
//            var luas =tv_lebar * tv_panjang
//            val kell = tv_lebar * tv_panjang
//
//            hasil_luas.text = getString(R.string.luas,luas.hasil_luas)
//            hasil_kel.text= getString(R.string.keliling,kell.hasil_kel)
//        }
        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false)

    }



}
