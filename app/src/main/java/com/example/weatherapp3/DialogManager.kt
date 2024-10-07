package com.example.weatherapp3

import android.content.Context
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

object DialogManager {
    fun locationSettingsDualog(context: Context, listener: Listener) {
        val builder = AlertDialog.Builder(context)
        val dialog = builder.create()
        dialog.setTitle("Включить местополежние?")
        dialog.setMessage("Местоположение отключено. Вы хотите включить местоположение?")
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK") { _, _ ->
            listener.onClick(null)
            dialog.dismiss()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO") { _, _ ->
            dialog.dismiss()
        }
        dialog.show()
    }

    fun searchByNameDialog(context: Context, listener: Listener) {
        val builder = AlertDialog.Builder(context)
        val edName = EditText(context)
        builder.setView(edName)
        val dialog = builder.create()
        dialog.setTitle("Названия города: ")
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK") { _, _ ->
            listener.onClick(edName.text.toString())
            dialog.dismiss()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO") { _, _ ->
            dialog.dismiss()
        }
        dialog.show()
    }

    interface Listener{
        fun onClick(name: String?)
    }
}