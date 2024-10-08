package myaong.popolog.interviewservice.domain;

public enum InterviewRole {

	INTERVIEWER, INTERVIEWEE;

	public static InterviewRole valueOfLower(String name) {
		return InterviewRole.valueOf(name.toUpperCase());
	}
}
