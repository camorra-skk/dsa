package org.dsa.recursion;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PascalTriangle {
    public static void main(String[] args) {
        log.info(" {}",generate(3));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0) {
            return new ArrayList<>();
        }
        if(numRows == 1) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            triangle.add(currRow);
            return triangle;
        }

        triangle = generate(numRows-1);
        List<Integer> prevRow = triangle.get(numRows-2);
        List<Integer> currRow = new ArrayList<>();
        currRow.add(1);
        for(int i=1;i<numRows-1;i++) {
            currRow.add(prevRow.get(i-1) + prevRow.get(i));
        }
        currRow.add(1);
        triangle.add(currRow);
        return triangle;
    }
}
