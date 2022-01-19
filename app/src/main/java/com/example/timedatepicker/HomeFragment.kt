package com.example.timedatepicker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.timedatepicker.Dailog.Datepickerdialog
import com.example.timedatepicker.Dailog.Timepickerdailog
import com.example.timedatepicker.databinding.FragmentHomeBinding
import java.util.logging.SimpleFormatter


class HomeFragment : Fragment() {
    lateinit var binding : FragmentHomeBinding
    var date = System.currentTimeMillis()
    var Time = System.currentTimeMillis()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(inflater)

        binding.DateBtn.setOnClickListener {
            Datepickerdialog {
            binding.DateBtn.text= GetFormat(it,"dd/MM/yyyy")
            }.show(childFragmentManager,"Date picker")
        }
        binding.TimeBtn.setOnClickListener {
            Timepickerdailog{
                binding.TimeBtn.text= GetFormat(it,"hh:mm a")
            }.show(childFragmentManager,"Time picker")
        }

        binding.dateTxt.text =GetFormat(date,"dd/MM/yyyy hh:mm a")

        return binding.root
    }


}