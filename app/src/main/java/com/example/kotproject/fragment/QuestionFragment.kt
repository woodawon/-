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

class QuestionFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        btn_next.setOnClickListener(this) // setOnClickListener()를 쓰려면 위의 class~~ Fragment() 옆에 , 하고 View.OnClickListener를 추가해줘야 사용 가능.

    }

    override fun onClick(v: View) { // 주의!!! -> v:View 하고, ?를 붙여서 파라미터 타입을 null로 해주는 게 보통이었는데, 이제 바뀌면서 nonnull로 됐기 때문에 붙이면 오류남!!
        when(v.id){ // 여기도 v?.id 였는데, 위의 주석과 같은 이유로 ? 붙이면 오류남!!
            R.id.btn_next -> {
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }

        }
    }


}