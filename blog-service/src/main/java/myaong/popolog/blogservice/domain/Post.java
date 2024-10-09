package myaong.popolog.blogservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`post`")
@Getter
@Setter
public class Post extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	private Long id;

	// 작성자 정보
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id", nullable = false)
	private MemberProfile memberProfile;

	@Column(name = "title", nullable = false)
	private String title;

	@Lob
	@Column(name = "content", nullable = false)
	private String content;

	// 섬네일 주소
	@Column(name = "thumbnail_url")
	private String thumbnailUrl;

	@Column(name = "is_blinded")
	private Boolean isBlinded;
}
