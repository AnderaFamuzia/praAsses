package com.example.praapp


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.praapp.databinding.ActivityMainBinding
import com.example.praapp.databinding.FragmentPersegiPanjangBinding
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
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("StringFormatInvalid")
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentPersegiPanjangBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_main, container, false)

        b_hitung.setOnClickListener {

            var lebarP = binding.tvLebar.toString().toInt()

            val panjangP = binding.tvPanjang.toString().toInt()

           val luas = lebarP * panjangP
            val kell = lebarP * panjangP*2

            binding.hasilLuas.text = "$luas"
            binding.hasilKel.text = "$kell"
        }



        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false)

    }



}
