package com.example.timedatepicker.Dailog

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import java.util.*

class Datepickerdialog(val callback :(Long)->Unit):DialogFragment(),DatePickerDialog.OnDateSetListener {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val calendar = Calendar.getInstance()
        val dayOfMonth= calendar.get(Calendar.DAY_OF_MONTH)
        val month= calendar.get(Calendar.MONTH)
        val year= calendar.get(Calendar.YEAR)
        return DatePickerDialog(requireActivity(),this,year,month,dayOfMonth)
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        val calendar = Calendar.getInstance()
        calendar.set(year,month,dayOfMonth)
        callback(calendar.timeInMillis)
    }
}