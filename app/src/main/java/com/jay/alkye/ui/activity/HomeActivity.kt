package com.jay.alkye.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jay.alkye.Data
import com.jay.alkye.adapter.HorizontalRVAdapter
import com.jay.alkye.adapter.VerticalRVAdapter
import com.jay.alkye.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var verticalRVAdapter: VerticalRVAdapter
    private lateinit var horizontalRVAdapter: HorizontalRVAdapter
    private var list = listOf(
        Data(
            category = "Technology",

            title = "Step Into Tomorrow: Exploring Spatial Computing’s Impact On Industries And The Metaverse!",
            time = "21 Feb 2024"
        ),
        Data(
            category = "Games",
            title = "VCT Shanghai : 1st day of Playoffs NA team 100Thieve and Pacific Geng move forward",
            time = "30 May 2024"
        ),
        Data(
            category = "Information",
            title = "Best Animation Studios: Mappa ,Madhouse,WIT studio ,Kyoto Animation, Studio Ghibli",
            time = "21 Feb 2023"
        ),
        Data(
            category = "Cosmos",
            title = "Bending Light: Blackhole is bending the light. Fact is Blackhole is bending medium of light not light.",
            time = "21 Feb 2022"
        ),
        Data(
            category = "Movies",
            title = "Top Movies Choice: Oppenheimer, Fight Club, Machinist, Joker, Seven , Kantara ,Shutter island ",
            time = "21 Feb 2024"
        ),

        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        setupHorizontalRecyclerview(list)
        setupVerticalRecyclerview(list)
        setupButtons()


    }

    private fun setupButtons() {
        binding.btViewAll.setOnClickListener {
            openDashBoard()
        }
    }

    private fun openDashBoard() {
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)
    }

    private fun setupVerticalRecyclerview(list: List<Data>) {
        verticalRVAdapter = VerticalRVAdapter(list)
        binding.rvVertical.adapter = verticalRVAdapter
        binding.rvVertical.layoutManager = object :
            LinearLayoutManager(this) {
            override fun canScrollVertically(): Boolean {
                return false
            }
        }

    }

    private fun setupHorizontalRecyclerview(list: List<Data>) {
        horizontalRVAdapter = HorizontalRVAdapter(list)
        binding.rvHorizontal.adapter = horizontalRVAdapter
        binding.rvHorizontal.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvHorizontal.isNestedScrollingEnabled = false

    }
}