package com.springboot.sahap.springbootmongodemo;

public class Review {
    private String reviewerName;
    private int reviewScore;
    private boolean approved;

    public Review(String reviewerName, int reviewScore, boolean approved) {
        this.reviewerName = reviewerName;
        this.reviewScore = reviewScore;
        this.approved = approved;
    }

    public Review() {
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
