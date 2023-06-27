package org.example.arrayhashing;

import java.util.*;
import java.util.stream.Collectors;

/**
 *Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
public class Group_Anagrams {
    private static int count = 0;
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        Arrays.stream(strs)
                .map(s -> Arrays.stream(s.split("")).sorted().collect(Collectors.joining()))
                .forEach(s -> {
                    Optional.ofNullable(map.get(s)).orElseGet(() -> map.put(s, Arrays.asList(strs[count])));
                    Optional.ofNullable(map.get(s)).ifPresent(s2 -> map.get(s).add(strs[count]));
                    count++;
                });
        return null;
    }
    public static void main(String[] args) {
        //String [] strs = {"eat","tea","tan","ate","nat","bat"};
        //groupAnagrams(strs);
    }
}

     /*
     public List<List<String>> groupAnagrams(String[] strs) {
     Map<String, List<Integer>> map = new HashMap();
        List solution = new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            if(map.get(Stream.of(strs[i].split(""))
                    .sorted()
                    .collect(Collectors.joining()))!=null){
                List<Integer> temp = map.get(Stream.of(strs[i].split(""))
                        .sorted()
                        .collect(Collectors.joining()));
                temp.add(i);
            }else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(Stream.of(strs[i].split(""))
                        .sorted()
                        .collect(Collectors.joining()),temp);
            }
        }
        for(List print : map.values().stream().sorted((o1, o2)->o1.size()- o2.size()).toList()){
            solution.add(print.stream().map(x->{
                return strs[(int) x];
            }).sorted().toList());
        }
        return solution;
    }*/

    /*Map<String, List<String>> map = new HashMap();
    List<List<String>> solution = new ArrayList();
        for (int i =0; i<strs.length; i++){
        List<String> temp = map.get(Arrays.stream(strs[i].split(""))
        .sorted()
        .collect(Collectors.joining()));
        if(temp!=null){
        temp.add(strs[i]);
        } else {
        temp = new ArrayList();
        temp.add(strs[i]);
        map.put(Stream.of(strs[i].split(""))
        .sorted()
        .collect(Collectors.joining()), temp);
        }
        }
        for(List<String> temp : map.values()){
        solution.add(temp.stream().sorted().toList());
        }
        return solution;
        }*/