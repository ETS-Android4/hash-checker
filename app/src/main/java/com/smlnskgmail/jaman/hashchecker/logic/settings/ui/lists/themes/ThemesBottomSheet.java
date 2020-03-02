package com.smlnskgmail.jaman.hashchecker.logic.settings.ui.lists.themes;

import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.BaseListBottomSheet;
import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.adapter.BaseListAdapter;
import com.smlnskgmail.jaman.hashchecker.logic.settings.SettingsHelper;

public class ThemesBottomSheet extends BaseListBottomSheet {

    @Override
    public BaseListAdapter getItemsAdapter() {
        return new ThemesListAdapter(
                getItems(),
                this,
                SettingsHelper.getSelectedTheme(getContext())
        );
    }

}