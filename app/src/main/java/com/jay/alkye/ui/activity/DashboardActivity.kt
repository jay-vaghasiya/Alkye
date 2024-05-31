package com.jay.alkye.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.jay.alkye.R
import com.jay.alkye.adapter.HorizontalSocialConnectRVAdapter
import com.jay.alkye.databinding.ActivityDashboardBinding
import com.jay.alkye.ui.fragments.BookMarkFragment
import com.jay.alkye.ui.fragments.NotificationFragment
import com.jay.alkye.ui.fragments.ProfileFragment
import com.jay.alkye.ui.fragments.SocialConnectFragment
import com.jay.alkye.ui.fragments.StreamFragment

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        setupNavigationBar()
    }


    private fun setupNavigationBar() {
        val icons = listOf(
            binding.icBook to Pair(SocialConnectFragment(), "BookFragment"),
            binding.icBookmark to Pair(BookMarkFragment(), "BookmarkFragment"),
            binding.icNotification to Pair(NotificationFragment(), "NotificationFragment"),
            binding.icTv to Pair(StreamFragment(), "TvFragment"),
            binding.icProfile to Pair(ProfileFragment(), "ProfileFragment")
        )

        binding.icBook.isSelected = true
        loadFragment(SocialConnectFragment(), "BookFragment")

        icons.forEach { (icon, fragmentPair) ->
            icon.setOnClickListener {
                icons.forEach { it.first.isSelected = false }
                icon.isSelected = true
                loadFragment(fragmentPair.first, fragmentPair.second)
            }
        }
    }

    private fun loadFragment(fragment: Fragment, tag: String) {
        val currentFragment = supportFragmentManager.findFragmentByTag(tag)
        if (currentFragment == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fg_layout, fragment, tag)
                .commit()
        }
    }

}