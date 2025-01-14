package com.develogical;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.*;
public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("cat")) {
            return "The cat (Felis catus) is a domestic species of small carnivorous mammal. " +
            "It is the only domesticated species in the family Felidae and is often referred to as the " +
            "domestic cat or house cat to distinguish it from the wild members of the family. A cat" +
            "can either be a house cat, a farm cat, or a feral cat; the latter ranges freely and avoids" +
            "human contact. Domestic cats are valued by humans for companionship and their ability to" +
            "kill rodents. About 60 cat breeds are recognized by various cat registries.";
        }
        if (query.toLowerCase().contains("what is your name")) {
            return "buckeyes";
        }
        if (query.toLowerCase().contains("which of the following numbers is the largest:")) {
            String thisQuery = query.toLowerCase();
            String[] arrOfStr = thisQuery.split(" ", -1);
            String[] slice = Arrays
                          .copyOfRange(
  
                              // Source
                              arrOfStr,
  
                              // The Start index
                              8,
  
                              // The end index
                              12);


            int[] values = Arrays.stream(slice)
                              .mapToInt(Integer::parseInt)
                              .toArray();
    
            IntStream stream2 = Arrays.stream(values);
            // IntStream -> Integer[]
            Integer[] integers = stream2.boxed().toArray(Integer[]::new);

            int max = Collections.max(Arrays.asList(integers));
            return Integer.toString(max);
        }
        return "";

    }
}
