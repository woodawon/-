package com.example.kotproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotproject.R
import kotlinx.android.synthetic.main.fragment_selection.*

class SelectionFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btn_back.setOnClickListener(this)
        option_1.setOnClickListener(this)
        option_2.setOnClickListener(this)
        option_3.setOnClickListener(this)
        option_4.setOnClickListener(this)

    }

    fun navigateWithIndex(index : Int) {
        val bundle = bundleOf("index" to index) // bundleOf()는 가변인자가 있는 Pair()형태의 파라미터를 넣음. 이 원래 형태에 따르면
    }                                                 // bundleOf(Pair("index", index)) 가 맞지만, "index" to index 로도 가능함. ++ 성능이 좋아서 bundleOf 많이 씀.
                                                      // Bundle : 데이터 저장 객체
    override fun onClick(v: View) {
        when(v.id) {
            R.id.option_1 -> {navigateWithIndex(1)}
            R.id.option_1 -> {navigateWithIndex(2)}
            R.id.option_1 -> {navigateWithIndex(3)}
            R.id.option_1 -> {navigateWithIndex(4)}
            R.id.btn_back -> {
                navController.popBackStack() // popBackStack() : navController 클래스 안에 있는 popBackStack() 함수임.
                navController.navigate(R.id.action_selectionFragment_to_resultFragment)
            }
        }
    }

}