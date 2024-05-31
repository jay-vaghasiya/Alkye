package com.jay.alkye.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jay.alkye.adapter.HorizontalSocialConnectRVAdapter
import com.jay.alkye.databinding.FragmentSocialConnectBinding


class SocialConnectFragment : Fragment() {
    private var _binding: FragmentSocialConnectBinding? = null
    private lateinit var horizontalSocialConnectRVAdapter: HorizontalSocialConnectRVAdapter
    private val titles = listOf(
        "The Ultimate Guide To Simplifying Your Routine With Generative AI Automation!",
        "How To Boost Productivity Using AI Tools",
        "AI In Everyday Life: Enhancing Your Daily Routine",
        "Mastering Time Management With AI Assistance",
        "Revolutionize Your Workflow With AI Technology",
        "Unlocking Efficiency: Tips For Using AI Automation",
        "The Future Of Work: Embracing AI For Better Productivity",
        "Streamlining Tasks: A Beginner's Guide To AI Automation",
        "Enhancing Creativity With Generative AI Tools",
        "Maximizing Output: AI Solutions For Busy Professionals"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSocialConnectBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        horizontalSocialConnectRVAdapter = HorizontalSocialConnectRVAdapter(titles)
        _binding?.rvSocialConnect?.adapter = horizontalSocialConnectRVAdapter
        _binding?.rvSocialConnect?.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    }

}
