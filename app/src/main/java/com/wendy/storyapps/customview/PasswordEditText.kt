package com.wendy.storyapps.customview

import android.content.Context
import android.text.InputFilter
import android.text.InputType
import androidx.appcompat.widget.AppCompatEditText
import com.wendy.storyapps.R

class PasswordEditText {
    class PasswordEditText(context: Context) : AppCompatEditText(context) {
        init {
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            setHint(R.string.password)
            filters = arrayOf(InputFilter.LengthFilter(8))
        }

        override fun onTextChanged(text: CharSequence?, start: Int, lengthBefore: Int, lengthAfter: Int) {
            super.onTextChanged(text, start, lengthBefore, lengthAfter)
            if (text.toString().length < 8) {
                error = context.getString(R.string.password_min_character)
            }
        }
    }
}