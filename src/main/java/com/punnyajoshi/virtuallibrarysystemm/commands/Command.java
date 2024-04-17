package com.punnyajoshi.virtuallibrarysystemm.commands;

import com.punnyajoshi.virtuallibrarysystemm.models.Library;
import com.punnyajoshi.virtuallibrarysystemm.commands.Command;

public interface Command {
    void execute(Library lib);
}
