package com.sun;

/**
 * Created by sunbinqiang on 08/12/2016.
 */
public class BinarySearch74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binarySearchMatrix(matrix, 0, matrix.length - 1, target);
    }

    public boolean binarySearchMatrix(int[][] matrix, int first, int last, int target){
        if(first > last) return false;
        int mid = (first + last)/2;
        if(matrix[mid][0] > target){
            return binarySearchMatrix(matrix, first, mid-1, target);
        }else if(matrix[mid][matrix[mid].length -1] < target){
            return binarySearchMatrix(matrix, mid+1, last, target);
        }else{
            return binarySearchList(matrix[mid], 0, matrix[mid].length - 1, target);
        }
    }

    public boolean binarySearchList(int[] list, int first, int last, int target){
        if(first > last) return false;
        int mid = (first + last) / 2;
        if(list[mid] > target){
            return binarySearchList(list, first, mid-1, target);
        }else if(list[mid] < target){
            return binarySearchList(list, mid+1, last, target);
        }else{
            return true;
        }
    }
}
