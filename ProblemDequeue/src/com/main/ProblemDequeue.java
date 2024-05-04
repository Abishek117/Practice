package com.main;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Scanner;

public class ProblemDequeue {

	public static void main(String[] args) {
		/*  -- my logic
		Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("Getting Elements");
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }
        
        //System.out.println(deque);
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i<(n-(m-1));i++){
        	Deque<Integer> deque2 = new ArrayDeque<>(deque); 
        	//System.out.println("deque2 : "+deque2);
        	int[] num = new int[m];
        	for (int j =0 ; j<m ; j++) {
        		num[j]= (int) deque2.getFirst();
        		//System.out.println("deque first element is"+num[j]);
        		deque2.removeFirst();
        	}
        	//System.out.println(Arrays.toString(num));
        	list.add(num);
        	deque.removeFirst();
        	//System.out.println("deque after removing first element"+deque);
        }
//        for(int[] arr : list) {
//        	System.out.println(Arrays.toString(arr));
//        }
        List<Integer> unique = new ArrayList<>();
        for(int[] arr1 : list) {
        	Integer[] array = Arrays.stream(arr1).distinct().boxed().toArray(Integer[]::new);
        	int count = array.length;
        	unique.add(count);
        }
        //System.out.println(unique);
        unique.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int maxElement = Collections.max(unique, Comparator.comparingInt(i -> Collections.frequency(unique , i)));
        /*
          - Collections.max() method to find the maximum element in the collection unique.
          - It takes two arguments: the collection from which to find the maximum element (unique) and a comparator to determine the order of elements
          
          - Comparator.comparingInt() is a static method provided by the Comparator interface. It's used to create a comparator that compares objects based on a particular integer property of those objects.
          - It takes function as a argument
          
          - Collections.frequency() is a static method that returns the number of occurrences of the specified element in the specified collection.
          	 -  When comparing two elements e1 and e2, the comparator looks at their frequencies in the collection.
    		 -	If the frequency of e1 is greater than the frequency of e2, it means e1 occurs more frequently in the collection, so e1 is considered greater than e2.
    		 -	If the frequency of e1 is less than the frequency of e2, it means e1 occurs less frequently in the collection, so e1 is considered less than e2.
    		 -	If the frequencies of e1 and e2 are equal, they have the same frequency, so their order is determined by other factors (like their natural ordering or insertion order).
         
        
        System.out.println(maxElement);
        */
		
		//chatgpt's logic (for performance(analyse this))
		Scanner scanner = new Scanner(System.in);
        int totalNumbers = scanner.nextInt();
        int subarraySize = scanner.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxUniqueIntegers = 0;

        for (int i = 0; i < totalNumbers; i++) {
            int num = scanner.nextInt();

            // Add the current element to the deque and update frequency map
            deque.addLast(num);
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

            // Adjust the window size if it exceeds the subarray size
            if (deque.size() > subarraySize) {
                int removed = deque.removeFirst();
                frequencyMap.put(removed, frequencyMap.get(removed) - 1);
                if (frequencyMap.get(removed) == 0) {
                    frequencyMap.remove(removed);
                }
            }

            // Update maxUniqueIntegers with the maximum number of unique integers observed so far
            maxUniqueIntegers = Math.max(maxUniqueIntegers, frequencyMap.size());

            // If the maximum possible unique integers is reached, break early
            if (maxUniqueIntegers == subarraySize) {
                break;
            }
        }

        System.out.println(maxUniqueIntegers);
	}

}
