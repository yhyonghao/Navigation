package com.yh.navigationfrist

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.nv_fragment_layout1.*


class BlankFragment2 : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.nv_fragment_layout1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nv_fragment1.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("uid", "111")
            Navigation.findNavController(it).navigate(R.id.action_blankFragment2_to_blankFragment3,bundle)
        }
    }
}
