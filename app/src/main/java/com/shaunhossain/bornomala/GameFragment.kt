package com.shaunhossain.bornomala

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import java.util.*


class GameFragment : Fragment() {


    private var presCounter: Int = 0
    private var maxPresCounter: Int = 2
    private var keys = arrayOf("আ", "ই", "ম", "অ")
    private val textAnswer: String = "আম"
    var smallbigforth: Animation? = null
    var textScreen: TextView? = null
    var textQuestion:TextView? = null
    var textTitle:TextView? = null

    //private lateinit var viewModel: GameViewModel
    companion object {
        fun newInstance() = GameFragment()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.game_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //viewModel = ViewModelProviders.of(this).get(GameViewModel::class.java)

        smallbigforth =
            AnimationUtils.loadAnimation(getActivity()?.getApplicationContext(), R.anim.smallbigforth)

        keys = shuffleArray(keys)

        for (key in keys) {
            addView(
                view!!.findViewById<LinearLayout>(R.id.layoutParent),
                key,
                view!!.findViewById<EditText>(R.id.editText)
            )
        }

        maxPresCounter = 2
    }

    private fun shuffleArray(ar: Array<String>): Array<String> {
        val rnd = Random()
        for (i in ar.size - 1 downTo 1) {
            val index = rnd.nextInt(i + 1)
            val a = ar[index]
            ar[index] = ar[i]
            ar[i] = a
        }
        return ar
    }

    private fun addView(
        viewParent: LinearLayout,
        text: String,
        editText: EditText
    ) {
        val linearLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        linearLayoutParams.rightMargin = 30
        val textView = TextView(context)
        textView.layoutParams = linearLayoutParams
        textView.background = this.resources.getDrawable(R.drawable.background_quiz_selector)
        textView.setTextColor(this.resources.getColor(R.color.colorGamePurple))
        textView.gravity = Gravity.CENTER
        textView.text = text
        textView.isClickable = true
        textView.isFocusable = true
        textView.textSize = 32f
       val typeface = Typeface.createFromAsset(context!!.getAssets(), "fonts/FredokaOneRegular.ttf")
        //textQuestion = findViewById(R.id.textQuestion) as TextView
        textQuestion = view!!.findViewById<TextView>(R.id.textScreen)
        textScreen = view!!.findViewById<TextView>(R.id.textScreen)
        textTitle = view!!.findViewById<TextView>(R.id.textTitle)
        textQuestion!!.setTypeface(typeface)
        textScreen!!.setTypeface(typeface)
        textTitle!!.setTypeface(typeface)
        editText.setTypeface(typeface)
        textView.setTypeface(typeface)
        textView.setOnClickListener {
            if (presCounter < maxPresCounter) {
                if (presCounter == 0)
                    editText.setText("")
                    editText.setText(editText.text.toString() + text)
                    textView.startAnimation(smallbigforth)
                    textView.animate().alpha(0f).duration = 300
                    presCounter++
                if (presCounter == maxPresCounter) doValidate()
            }
        }
        viewParent.addView(textView)
    }

    private fun doValidate() {
        presCounter = 0
        val editText: EditText = view!!.findViewById<EditText>(R.id.editText)
        val linearLayout: LinearLayout = view!!.findViewById<LinearLayout>(R.id.layoutParent)
        //Log.v("check",editText.text.toString())
        if (editText.text.toString() == textAnswer) {
            Toast.makeText(getActivity()?.getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
           // val a = Intent(this@MainActivity, BossAct::class.java)
            //startActivity(a)
            editText.setText("")
        } else {
            Toast.makeText(getActivity()?.getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show()
            editText.setText("")
        }
        keys = shuffleArray(keys)
        linearLayout.removeAllViews()
        for (key in keys) {
            addView(linearLayout, key, editText)
        }
    }

}
