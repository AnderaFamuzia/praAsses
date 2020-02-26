package com.example.praapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.praapp.databinding.FragmentPersegiPanjangBinding
import com.example.praapp.databinding.FragmentSegitigaBinding
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import kotlinx.android.synthetic.main.fragment_segitiga.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class segitiga : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSegitigaBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_main, container, false)

        b_hitung.setOnClickListener {

            var lebarS = binding.editText.toString().toInt()

            val panjangS = binding.editText2.toString().toInt()

            val luas = lebarS * panjangS / 2
            val kell = lebarS * panjangS

            binding.textView4.text = "$luas"
            binding.textView5.text = "$kell"
        }
        return inflater.inflate(R.layout.fragment_segitiga, container, false)
    }




}
