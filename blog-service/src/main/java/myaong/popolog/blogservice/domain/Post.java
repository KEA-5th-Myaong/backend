package myaong.popolog.blogservice.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`post`")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

	@Builder
	public Post(String title, String content, String thumbnailUrl, Boolean isBlinded) {
		this.title = title;
		this.content = content;
		this.thumbnailUrl = thumbnailUrl;
		this.isBlinded = isBlinded;
	}
}
