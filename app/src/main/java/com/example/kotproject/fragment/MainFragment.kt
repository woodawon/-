package com.example.kotproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotproject.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    lateinit var navController : NavController; // lateinit : 지연 초기화 예약어 -> 불필요한 지속적인 초기화 과정으로 인한 메모리&실행 시간 소비를 최대한 막기 위해서 사용.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? // Bundle : 클래스
    ): View? { // View : 클래스
        return inflater.inflate(R.layout.fragment_main, container, false) // inflate : layoutinflator클래스 -> public View inflate{}
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState) // super -> Fragment 클래스

        navController = Navigation.findNavController(view) // Navigation : Object -> findNavController() 함수 사용.

        btn_next.setOnClickListener { // 얘는 Unit이고, {}가 아니라 ()인 setOnClickListener는 View.OnClickListener기 때문에 중괄호{}인 애를 쓸 때는
                                      // 위의 class MainFragment : Fragment() 옆에 View.OnClickListener를 선언할 필요가 없는 것임.
            navController.navigate(R.id.action_mainFragment_to_questionFragment2)
        }
    }

}