package com.ezdream.template.ui.pageA

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.ezdream.template.R
import com.ezdream.template.databinding.FragmentABinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AFragment : Fragment() {

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<AFragmentVM>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentABinding.inflate(inflater, container, false)

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.fragmentAFab.setOnClickListener {
            findNavController().navigate(R.id.action_AFragment_to_BFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}