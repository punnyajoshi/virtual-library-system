package com.punnyajoshi.virtuallibrarysystemm.commands;

import com.punnyajoshi.virtuallibrarysystemm.models.Library;

public class ShowStatisticsCommand implements Command {
    @Override
    public void execute(Library lib) {
        lib.showStatistics();
    }
}