package com.develogical;

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
        return "";

    }
}
