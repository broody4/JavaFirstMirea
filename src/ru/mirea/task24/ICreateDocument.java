package ru.mirea.task24;

public interface ICreateDocument {

    IDocument CreateNew(String stFolder, String stName, int iSize);

    IDocument CreateOpen(String stName);
}
