package com.example.praapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        // Inflate the layout for this fragment
//        button5.setOnClickListener {
//            textView4.text=getString(R.string.luas)
//            textView5.text=getString(R.string.keliling)
//        }
        return inflater.inflate(R.layout.fragment_segitiga, container, false)
    }

//    private fun hitung() {
//        var luas = editText * editText2 / 2
//        var keliling = textView4 * textView5
//    }


}
