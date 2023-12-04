package com.irobtechnologies.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("irobtechnologies-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
