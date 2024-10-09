package myaong.popolog.blogservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`bookmark`",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"member_id", "post_id"})})
@Getter
@Setter
public class Bookmark extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookmark_id")
	private Long id;

	// 북마크한 회원 => 회원 정보 자체를 쓸 일은 없음(중복만 확인)
	@Column(name = "member_id")
	private Long memberId;

	// 대상 포스트
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id")
	private Post post;
}
