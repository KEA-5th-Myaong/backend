package myaong.popolog.memberservice.domain;

public enum SocialType {

	NORMAL, KAKAO, GOOGLE;

	public static SocialType valueOfLower(String name) {
		return SocialType.valueOf(name.toUpperCase());
	}
}
