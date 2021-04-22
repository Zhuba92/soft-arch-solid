package edu.wctc.independentcopy.writer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListWriter implements Writer
{
    @Override
    public void writeln(String line)
    {
        String[] lineSplit = line.split(" ");
        List<String> lineList = new ArrayList<>(Arrays.asList(lineSplit));
        for (String s : lineList)
        {
            System.out.println(s);
        }
    }
}
