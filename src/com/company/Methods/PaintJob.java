package com.company;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double buckets = 0;

        double area = width * height;

        areaPerBucket = area/areaPerBucket;

        buckets = areaPerBucket-extraBuckets;

        return (int)buckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double buckets = 0;
        double area = width * height;

        areaPerBucket = area/areaPerBucket;

        buckets = areaPerBucket;

        return (int)buckets;
    }

    public static int getBucketCount(double areaPerBucket, double area){
        if (area < 0 || areaPerBucket <= 0){
            return -1;
        }
        double buckets = 0;

        areaPerBucket = Math.ceil(area)/Math.ceil(areaPerBucket);

        buckets = areaPerBucket;

        return (int)buckets;
    }

}
