package com.enigma.simple_android_submission

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.enigma.simple_android_submission.databinding.ActivityMainBinding
import com.enigma.simple_android_submission.ui.about.AboutActivity
import com.enigma.simple_android_submission.ui.detail.DetailActivity
import com.enigma.simple_android_submission.ui.menu.MenuAdapter
import com.enigma.simple_android_submission.ui.menu.MenuViewModel
import com.enigma.simple_android_submission.ui.menu.MenuViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var menuAdapter: MenuAdapter
    private lateinit var menuViewModel: MenuViewModel

    companion object {
        const val MENU = "MENU"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViewModel()
        setupRecyclerView()

        menuViewModel.menus.observe(this) {
            menuAdapter.differ.submitList(it)
        }

        menuAdapter.setOnItemClickListener {
            menuViewModel.getMenu(it)
            Intent(this, DetailActivity::class.java).apply {
                this.putExtra(MENU, it)
                startActivity(this)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_action -> {
                Intent(this@MainActivity, AboutActivity::class.java).also {
                    startActivity(it)
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun setupViewModel() {
        val viewModelFactory = MenuViewModelFactory()
        menuViewModel = ViewModelProvider(this, viewModelFactory)[MenuViewModel::class.java]
    }

    private fun setupRecyclerView() {
        menuAdapter = MenuAdapter()
        binding.apply {
            rvMenu.apply {
                adapter = menuAdapter
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }
    }

}