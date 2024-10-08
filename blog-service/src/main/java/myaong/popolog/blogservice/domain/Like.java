package myaong.popolog.blogservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`like`",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"member_id", "post_id"})})
@Getter
@Setter
public class Like extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "like_id")
	private Long id;

	// 좋아요를 남긴 회원
	@Column(name = "member_id", nullable = false)
	private Long memberId;

	// 대상 포스트
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id", nullable = false)
	private Post post;
}
