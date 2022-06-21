package com.enigma.simple_android_submission.ui.menu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.enigma.simple_android_submission.R
import com.enigma.simple_android_submission.data.models.Menu
import com.enigma.simple_android_submission.databinding.MenuItemBinding
import com.enigma.simple_android_submission.util.Converter

class MenuAdapter : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    inner class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = MenuItemBinding.bind(itemView)

        fun bind(menu: Menu) {
            binding.apply {
                tvName.text = menu.name
                tvPrice.text = Converter.rupiah(menu.price.toDouble())
                Glide.with(itemView.context)
                    .load(menu.image)
                    .into(ivMenus)
                itemView.setOnClickListener {
                    onItemClickListener?.let {
                        it(menu)
                    }
                }
            }
        }
    }

    private val differCallback = object : DiffUtil.ItemCallback<Menu>() {
        override fun areItemsTheSame(oldItem: Menu, newItem: Menu): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Menu, newItem: Menu): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val menu = differ.currentList[position]
        holder.bind(menu)
    }

    override fun getItemCount(): Int = differ.currentList.size

    private var onItemClickListener: ((Menu) -> Unit)? = null

    fun setOnItemClickListener(listener: (Menu) -> Unit) {
        onItemClickListener = listener
    }

}