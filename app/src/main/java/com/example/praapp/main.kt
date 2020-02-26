package com.example.praapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.praapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_main.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class main : Fragment() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main, container, false)

        b_panjang.setOnClickListener {
            findNavController().navigate(R.id.action_main_to_segitiga)
        }

        b_segitiga.setOnClickListener {
            findNavController().navigate(R.id.action_main_to_segitiga)
        }


        return inflater.inflate(R.layout.fragment_main, container, false)

    }


}
