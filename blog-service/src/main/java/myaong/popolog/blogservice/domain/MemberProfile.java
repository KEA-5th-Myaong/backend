package myaong.popolog.blogservice.domain;

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

	@Column(name = "nickname", nullable = false)
	private String nickname;

	// 프로필 사진 주소
	@Column(name = "profile_pic_url")
	private String profilePicUrl;
}
