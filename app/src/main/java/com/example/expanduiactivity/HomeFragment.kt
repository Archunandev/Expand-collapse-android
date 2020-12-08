package com.example.expanduiactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.github.aakira.expandablelayout.ExpandableRelativeLayout


class HomeFragment : Fragment(), View.OnClickListener {

    lateinit var mExpandButton : Button
    lateinit var mExpandButton1a : Button
    lateinit var mExpandButton1b : Button
    lateinit var mExpandButton2 : Button
    lateinit var mExpandButton2a : Button
    lateinit var mExpandableRelativeLayout: ExpandableRelativeLayout
    lateinit var mExpandableRelativeLayout1a: ExpandableRelativeLayout
    lateinit var mExpandableRelativeLayout1b: ExpandableRelativeLayout
    lateinit var mExpandableRelativeLayout2: ExpandableRelativeLayout
    lateinit var mExpandableRelativeLayout2a: ExpandableRelativeLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater!!.inflate(R.layout.fragment_home, container, false)
        mExpandButton = view.findViewById<Button>(R.id.expandButton)
        mExpandableRelativeLayout = view.findViewById<ExpandableRelativeLayout>(R.id.expandableLayout)
        mExpandButton.setOnClickListener(this)


        mExpandButton1a = view.findViewById<Button>(R.id.expandButtonassi1_1)
        mExpandableRelativeLayout1a = view.findViewById<ExpandableRelativeLayout>(R.id.expandableLayout)
        mExpandButton1a.setOnClickListener(this)










        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.expandButton ->{
                mExpandableRelativeLayout.toggle()
              // mExpandableRelativeLayout.setVisibility(View.VISIBLE)
            }
            R.id.expandButtonassi1_1 ->{
                mExpandableRelativeLayout1a.toggle()
               // mExpandableRelativeLayout1a.setVisibility(View.VISIBLE)
            }

            }
        }


    }


