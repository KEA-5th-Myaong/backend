package myaong.popolog.memberservice.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import myaong.popolog.memberservice.enums.Permission;
import myaong.popolog.memberservice.enums.SocialType;

import java.time.LocalDate;

@Entity
@Table(name = "`member`")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private Long id;

	// 로그인 아이디
	@Column(name = "username", nullable = false, unique = true, updatable = false)
	private String username;

	@Column(name = "password")
	private String password;

	// 소셜 로그인 타입
	@Enumerated(EnumType.STRING)
	@Column(name = "social_type", nullable = false, updatable = false)
	private SocialType socialType;

	// 본명
	@Column(name = "name", nullable = false)
	private String name;

	// 닉네임
	@Column(name = "nickname", nullable = false)
	private String nickname;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	// 권한
	@Enumerated(EnumType.STRING)
	@Column(name = "permission", nullable = false)
	private Permission permission;

	// 프로필 사진 주소
	@Column(name = "profile_pic_url")
	private String profilePicUrl;

	// 로그인 시도 횟수. 로그인 성공 시 초기
	@Column(name = "count_attempt", nullable = false)
	private Integer countAttempt;

	// 정지 해제일. (오늘 날짜 < 정지 해제일)이면 정지된 회원
	@Column(name = "unban_date", nullable = false)
	private LocalDate unbanDate;

	@Builder
	public Member(String password, String name, String nickname, String email, Permission permission, String profilePicUrl, Integer countAttempt, LocalDate unbanDate) {
		this.password = password;
		this.name = name;
		this.nickname = nickname;
		this.email = email;
		this.permission = permission;
		this.profilePicUrl = profilePicUrl;
		this.countAttempt = countAttempt;
		this.unbanDate = unbanDate;
	}
}
