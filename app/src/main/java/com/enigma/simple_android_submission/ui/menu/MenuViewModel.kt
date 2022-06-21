package com.enigma.simple_android_submission.ui.menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.enigma.simple_android_submission.data.models.Menu
import com.enigma.simple_android_submission.data.models.MenuData

class MenuViewModel : ViewModel() {
    private var _menus = MutableLiveData(MenuData.listMenu)
    val menus: LiveData<List<Menu>> get() = _menus

    private var _menu = MutableLiveData<Menu>()
    val menu: LiveData<Menu> get() = _menu

    fun getMenu(menu: Menu) {
        _menu.postValue(menu)
    }

}