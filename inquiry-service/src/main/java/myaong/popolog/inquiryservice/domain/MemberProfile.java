package myaong.popolog.inquiryservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`member_profile`")
@Getter
@Setter
public class MemberProfile extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private Long id;

	// 글 조회 시 로그인 아이디 표시
	@Column(name = "username", nullable = false)
	private String username;
}
