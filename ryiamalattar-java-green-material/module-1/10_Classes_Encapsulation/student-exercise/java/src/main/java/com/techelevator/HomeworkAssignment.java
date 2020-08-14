package com.techelevator;

public class HomeworkAssignment {
	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	
	public int getEarnedMarks() {
		return earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	public String getLetterGrade() {
		
		float letterGradeNum = earnedMarks * 100 / possibleMarks;
		String letterGrade;
		if (letterGradeNum >= 90) {
			return letterGrade = "A";
		}
		else if (letterGradeNum >= 80 && letterGradeNum <=89) {
			return letterGrade = "B";
			
		}
		else if (letterGradeNum >= 70 && letterGradeNum <=79) {
			return letterGrade = "C";
		}
		
		else if (letterGradeNum >= 60 && letterGradeNum <=69) {
			return letterGrade = "D";
		}
		
	
		else return letterGrade = "F";
	}
	

}
