package edu.wctc.independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader
{
    @Override
    public String readln()
    {
        List<String> people = new ArrayList<String>();
        people.add("Taylor");
        people.add("Zach");
        people.add("Larry");
        people.add("Michelle");
        String line = "";

        for (int i = 0; i < people.size(); i++)
        {
            line += people.get(i) + " ";
        }
        return line;
    }

}
