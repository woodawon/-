package com.example.kotproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotproject.R
import kotlinx.android.synthetic.main.fragment_result.*
import org.w3c.dom.Text


class ResultFragment : Fragment() {

    lateinit var navController: NavController
    var option = -1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        option = arguments?.getInt("index")?:-1 // arguments?.getInt : 데이터 값을 받는 걸 의미함.
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        btn_home.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
        setResult(option)
    }

    fun setResult(option : Int) {
        when(option) {
            1 -> {
                tv_main.text = resources.getString(R.string.main_text1) // strings.xml에 있는 것들을 가져오고 싶을 때 쓰는 거 : resources.getString(R.string.~~)
                tv_sub.text = resources.getString(R.string.sub_text1)
            }

            2 -> {
                tv_main.text= resources.getString(R.string.main_text2)
                tv_sub.text= resources.getString(R.string.sub_text2)

            }

            3-> {
                tv_main.text= resources.getString(R.string.main_text3)
                tv_sub.text= resources.getString(R.string.sub_text3)
            }

            4-> {
                tv_main.text= resources.getString(R.string.main_text4)
                tv_sub.text= resources.getString(R.string.sub_text4)
            }
        }

    }


}