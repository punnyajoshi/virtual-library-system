package com.punnyajoshi.virtuallibrarysystemm.commands;

import com.punnyajoshi.virtuallibrarysystemm.models.Library;

public class UploadBookCommand implements Command{
    @Override
    public void execute(Library lib){
        lib.UploadBook("src/main/resources/dataset.csv");
    }
}
