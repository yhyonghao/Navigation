package com.yh.navigationfrist

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.nv_fragment_layout3.*


class BlankFragment3 : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.nv_fragment_layout3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userId = arguments!!.getString("uid")
        nv_text3.setText(userId+nv_text3.text)
        nv_fragment3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_blankFragment3_to_blankFragment1)
        }
    }
}
