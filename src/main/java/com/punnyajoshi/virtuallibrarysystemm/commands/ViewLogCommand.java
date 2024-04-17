package com.punnyajoshi.virtuallibrarysystemm.commands;

import com.punnyajoshi.virtuallibrarysystemm.models.Library;

public class ViewLogCommand implements Command {
    @Override
    public void execute(Library lib) {
        lib.viewLog();
    }
}