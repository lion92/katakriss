package fr.arolla;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzz {

    public static void main(String[] args){
        logger.debug("De 1 à 200 : {}", IntStream.rangeClosed(1, 200)
                .mapToObj(FizzBuzz::fizzBuzz)
                .collect(Collectors.toList()));
    }
    private static final Logger logger
            = LoggerFactory.getLogger(FizzBuzz.class);




    public static String fizzBuzz(int number){

        if(number<=0){
            logger.debug("Le nombre"+number+" est inférieur 0", FizzBuzz.class.getSimpleName());
            throw new IllegalArgumentException();
        }
        String result="";



        result=  Map.of(3,"Fizz",5,"Buzz")
                .entrySet()
                .stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .filter(entry->number % entry.getKey() == 0).
                map(entrystr->entrystr.getValue()).
                collect(Collectors.joining());


        return result.isBlank() ? String.valueOf(number) : result;
    }

    private static String divisibleByNumber(int number, int diviseur, String result) {
        String str="";

            if(new PredicateNumber(diviseur).test(number)){
                str+=result;
            };

        return str;
    }

    static class PredicateNumber implements Predicate<Integer>{
        int diviseur;

        public PredicateNumber(int diviseur) {
            this.diviseur = diviseur;
        }

        @Override
        public boolean test(Integer number) {
            return  number % diviseur == 0;

        }
    }


}
